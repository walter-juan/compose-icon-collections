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

public val Twbs.Unity: ImageVector
    get() {
        if (_unity != null) {
            return _unity!!
        }
        _unity = Builder(name = "Unity", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.2f)
                verticalLineTo(3.733f)
                lineTo(8.61f, 0.0f)
                verticalLineToRelative(2.867f)
                lineToRelative(2.503f, 1.466f)
                curveToRelative(0.099f, 0.067f, 0.099f, 0.2f, 0.0f, 0.234f)
                lineTo(8.148f, 6.3f)
                curveToRelative(-0.099f, 0.067f, -0.197f, 0.033f, -0.263f, 0.0f)
                lineTo(4.92f, 4.567f)
                curveToRelative(-0.099f, -0.034f, -0.099f, -0.2f, 0.0f, -0.234f)
                lineToRelative(2.504f, -1.466f)
                verticalLineTo(0.0f)
                lineTo(1.0f, 3.733f)
                verticalLineTo(11.2f)
                verticalLineToRelative(-0.033f)
                verticalLineToRelative(0.033f)
                lineToRelative(2.438f, -1.433f)
                verticalLineTo(6.833f)
                curveToRelative(0.0f, -0.1f, 0.131f, -0.166f, 0.197f, -0.133f)
                lineTo(6.6f, 8.433f)
                curveToRelative(0.099f, 0.067f, 0.132f, 0.134f, 0.132f, 0.234f)
                verticalLineToRelative(3.466f)
                curveToRelative(0.0f, 0.1f, -0.132f, 0.167f, -0.198f, 0.134f)
                lineTo(4.031f, 10.8f)
                lineToRelative(-2.438f, 1.433f)
                lineTo(7.983f, 16.0f)
                lineToRelative(6.391f, -3.733f)
                lineToRelative(-2.438f, -1.434f)
                lineTo(9.434f, 12.3f)
                curveToRelative(-0.099f, 0.067f, -0.198f, 0.0f, -0.198f, -0.133f)
                verticalLineTo(8.7f)
                curveToRelative(0.0f, -0.1f, 0.066f, -0.2f, 0.132f, -0.233f)
                lineToRelative(2.965f, -1.734f)
                curveToRelative(0.099f, -0.066f, 0.197f, 0.0f, 0.197f, 0.134f)
                verticalLineTo(9.8f)
                close()
            }
        }
        .build()
        return _unity!!
    }

private var _unity: ImageVector? = null
