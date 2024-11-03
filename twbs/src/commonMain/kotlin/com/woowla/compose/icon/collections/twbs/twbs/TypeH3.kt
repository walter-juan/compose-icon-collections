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

public val Twbs.TypeH3: ImageVector
    get() {
        if (_typeH3 != null) {
            return _typeH3!!
        }
        _typeH3 = Builder(name = "TypeH3", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.07f, 8.4f)
                horizontalLineToRelative(1.049f)
                curveToRelative(1.174f, 0.0f, 1.99f, 0.69f, 2.004f, 1.724f)
                reflectiveCurveToRelative(-0.802f, 1.786f, -2.068f, 1.779f)
                curveToRelative(-1.11f, -0.007f, -1.905f, -0.605f, -1.99f, -1.357f)
                horizontalLineToRelative(-1.21f)
                curveTo(8.926f, 11.91f, 10.116f, 13.0f, 12.028f, 13.0f)
                curveToRelative(1.99f, 0.0f, 3.439f, -1.188f, 3.404f, -2.87f)
                curveToRelative(-0.028f, -1.553f, -1.287f, -2.221f, -2.096f, -2.313f)
                verticalLineToRelative(-0.07f)
                curveToRelative(0.724f, -0.127f, 1.814f, -0.935f, 1.772f, -2.293f)
                curveToRelative(-0.035f, -1.392f, -1.21f, -2.468f, -3.038f, -2.454f)
                curveToRelative(-1.927f, 0.007f, -2.94f, 1.196f, -2.981f, 2.426f)
                horizontalLineToRelative(1.23f)
                curveToRelative(0.064f, -0.71f, 0.732f, -1.336f, 1.744f, -1.336f)
                curveToRelative(1.027f, 0.0f, 1.744f, 0.64f, 1.744f, 1.568f)
                curveToRelative(0.007f, 0.95f, -0.738f, 1.639f, -1.744f, 1.639f)
                horizontalLineToRelative(-0.991f)
                verticalLineTo(8.4f)
                close()
                moveTo(7.495f, 13.0f)
                verticalLineTo(3.201f)
                horizontalLineTo(6.174f)
                verticalLineToRelative(4.15f)
                horizontalLineTo(1.32f)
                verticalLineTo(3.2f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(1.32f)
                verticalLineTo(8.513f)
                horizontalLineToRelative(4.854f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _typeH3!!
    }

private var _typeH3: ImageVector? = null
