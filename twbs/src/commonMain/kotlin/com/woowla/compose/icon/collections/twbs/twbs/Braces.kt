package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Braces: ImageVector
    get() {
        if (_braces != null) {
            return _braces!!
        }
        _braces = Builder(name = "Braces", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.114f, 8.063f)
                verticalLineTo(7.9f)
                curveToRelative(1.005f, -0.102f, 1.497f, -0.615f, 1.497f, -1.6f)
                verticalLineTo(4.503f)
                curveToRelative(0.0f, -1.094f, 0.39f, -1.538f, 1.354f, -1.538f)
                horizontalLineToRelative(0.273f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-0.376f)
                curveTo(3.25f, 2.0f, 2.49f, 2.759f, 2.49f, 4.352f)
                verticalLineToRelative(1.524f)
                curveToRelative(0.0f, 1.094f, -0.376f, 1.456f, -1.49f, 1.456f)
                verticalLineToRelative(1.299f)
                curveToRelative(1.114f, 0.0f, 1.49f, 0.362f, 1.49f, 1.456f)
                verticalLineToRelative(1.524f)
                curveToRelative(0.0f, 1.593f, 0.759f, 2.352f, 2.372f, 2.352f)
                horizontalLineToRelative(0.376f)
                verticalLineToRelative(-0.964f)
                horizontalLineToRelative(-0.273f)
                curveToRelative(-0.964f, 0.0f, -1.354f, -0.444f, -1.354f, -1.538f)
                verticalLineTo(9.663f)
                curveToRelative(0.0f, -0.984f, -0.492f, -1.497f, -1.497f, -1.6f)
                moveTo(13.886f, 7.9f)
                verticalLineToRelative(0.163f)
                curveToRelative(-1.005f, 0.103f, -1.497f, 0.616f, -1.497f, 1.6f)
                verticalLineToRelative(1.798f)
                curveToRelative(0.0f, 1.094f, -0.39f, 1.538f, -1.354f, 1.538f)
                horizontalLineToRelative(-0.273f)
                verticalLineToRelative(0.964f)
                horizontalLineToRelative(0.376f)
                curveToRelative(1.613f, 0.0f, 2.372f, -0.759f, 2.372f, -2.352f)
                verticalLineToRelative(-1.524f)
                curveToRelative(0.0f, -1.094f, 0.376f, -1.456f, 1.49f, -1.456f)
                verticalLineTo(7.332f)
                curveToRelative(-1.114f, 0.0f, -1.49f, -0.362f, -1.49f, -1.456f)
                verticalLineTo(4.352f)
                curveTo(13.51f, 2.759f, 12.75f, 2.0f, 11.138f, 2.0f)
                horizontalLineToRelative(-0.376f)
                verticalLineToRelative(0.964f)
                horizontalLineToRelative(0.273f)
                curveToRelative(0.964f, 0.0f, 1.354f, 0.444f, 1.354f, 1.538f)
                verticalLineTo(6.3f)
                curveToRelative(0.0f, 0.984f, 0.492f, 1.497f, 1.497f, 1.6f)
            }
        }
        .build()
        return _braces!!
    }

private var _braces: ImageVector? = null
