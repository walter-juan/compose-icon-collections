package com.woowla.compose.icon.collections.remix.remix.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.SystemGroup

public val SystemGroup.ShareForwardBoxFill: ImageVector
    get() {
        if (_shareForwardBoxFill != null) {
            return _shareForwardBoxFill!!
        }
        _shareForwardBoxFill = Builder(name = "ShareForwardBoxFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.448f, 2.448f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(16.0f, 5.0f)
                verticalLineTo(1.0f)
                lineTo(23.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(12.895f, 7.0f, 12.0f, 7.895f, 12.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                curveTo(10.0f, 6.791f, 11.791f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _shareForwardBoxFill!!
    }

private var _shareForwardBoxFill: ImageVector? = null
