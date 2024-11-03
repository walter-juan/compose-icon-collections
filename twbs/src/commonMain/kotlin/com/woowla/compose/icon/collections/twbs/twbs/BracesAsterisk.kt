package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BracesAsterisk: ImageVector
    get() {
        if (_bracesAsterisk != null) {
            return _bracesAsterisk!!
        }
        _bracesAsterisk = Builder(name = "BracesAsterisk", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.114f, 8.063f)
                verticalLineTo(7.9f)
                curveToRelative(1.005f, -0.102f, 1.497f, -0.615f, 1.497f, -1.6f)
                verticalLineTo(4.503f)
                curveToRelative(0.0f, -1.094f, 0.39f, -1.538f, 1.354f, -1.538f)
                horizontalLineToRelative(0.273f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-0.376f)
                curveTo(2.25f, 2.0f, 1.49f, 2.759f, 1.49f, 4.352f)
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
                moveTo(14.886f, 7.9f)
                verticalLineToRelative(0.164f)
                curveToRelative(-1.005f, 0.103f, -1.497f, 0.616f, -1.497f, 1.6f)
                verticalLineToRelative(1.798f)
                curveToRelative(0.0f, 1.094f, -0.39f, 1.538f, -1.354f, 1.538f)
                horizontalLineToRelative(-0.273f)
                verticalLineToRelative(0.964f)
                horizontalLineToRelative(0.376f)
                curveToRelative(1.613f, 0.0f, 2.372f, -0.759f, 2.372f, -2.352f)
                verticalLineToRelative(-1.524f)
                curveToRelative(0.0f, -1.094f, 0.376f, -1.456f, 1.49f, -1.456f)
                verticalLineToRelative(-1.3f)
                curveToRelative(-1.114f, 0.0f, -1.49f, -0.362f, -1.49f, -1.456f)
                verticalLineTo(4.352f)
                curveTo(14.51f, 2.759f, 13.75f, 2.0f, 12.138f, 2.0f)
                horizontalLineToRelative(-0.376f)
                verticalLineToRelative(0.964f)
                horizontalLineToRelative(0.273f)
                curveToRelative(0.964f, 0.0f, 1.354f, 0.444f, 1.354f, 1.538f)
                verticalLineTo(6.3f)
                curveToRelative(0.0f, 0.984f, 0.492f, 1.497f, 1.497f, 1.6f)
                moveTo(7.5f, 11.5f)
                verticalLineTo(9.207f)
                lineToRelative(-1.621f, 1.621f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(6.792f, 8.5f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.293f)
                lineTo(5.172f, 5.879f)
                lineToRelative(0.707f, -0.707f)
                lineTo(7.5f, 6.792f)
                verticalLineTo(4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.293f)
                lineToRelative(1.621f, -1.621f)
                lineToRelative(0.707f, 0.707f)
                lineTo(9.208f, 7.5f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(9.207f)
                lineToRelative(1.621f, 1.621f)
                lineToRelative(-0.707f, 0.707f)
                lineTo(8.5f, 9.208f)
                verticalLineTo(11.5f)
                close()
            }
        }
        .build()
        return _bracesAsterisk!!
    }

private var _bracesAsterisk: ImageVector? = null
