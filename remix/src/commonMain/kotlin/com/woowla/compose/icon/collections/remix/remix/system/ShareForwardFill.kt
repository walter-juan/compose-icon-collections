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

public val SystemGroup.ShareForwardFill: ImageVector
    get() {
        if (_shareForwardFill != null) {
            return _shareForwardFill!!
        }
        _shareForwardFill = Builder(name = "ShareForwardFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(7.542f, 14.0f, 4.54f, 15.95f, 3.032f, 18.811f)
                curveTo(3.011f, 18.543f, 3.0f, 18.273f, 3.0f, 18.0f)
                curveTo(3.0f, 12.477f, 7.477f, 8.0f, 13.0f, 8.0f)
                verticalLineTo(3.0f)
                lineTo(23.0f, 11.0f)
                lineTo(13.0f, 19.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _shareForwardFill!!
    }

private var _shareForwardFill: ImageVector? = null
