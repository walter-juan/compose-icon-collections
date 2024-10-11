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

public val SystemGroup.ShareForward2Fill: ImageVector
    get() {
        if (_shareForward2Fill != null) {
            return _shareForward2Fill!!
        }
        _shareForward2Fill = Builder(name = "ShareForward2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.552f, 21.552f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 21.0f, 2.0f, 20.552f, 2.0f, 20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(12.0f, 10.0f)
                horizontalLineTo(9.0f)
                curveTo(7.004f, 10.0f, 5.236f, 10.974f, 4.146f, 12.473f)
                curveTo(4.858f, 8.785f, 8.104f, 6.0f, 12.0f, 6.0f)
                verticalLineTo(2.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 14.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _shareForward2Fill!!
    }

private var _shareForward2Fill: ImageVector? = null
