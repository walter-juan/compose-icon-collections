package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Floorp: ImageVector
    get() {
        if (_floorp != null) {
            return _floorp!!
        }
        _floorp = Builder(name = "Floorp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.348f, 1.146f)
                curveToRelative(-1.917f, 0.0f, -2.807f, 0.326f, -3.84f, 2.116f)
                lineTo(0.717f, 9.852f)
                reflectiveCurveTo(0.0f, 10.779f, 0.0f, 11.998f)
                curveToRelative(0.0f, 1.22f, 0.717f, 2.156f, 0.717f, 2.156f)
                lineToRelative(3.803f, 6.584f)
                curveToRelative(1.033f, 1.79f, 1.92f, 2.116f, 3.837f, 2.116f)
                horizontalLineToRelative(7.286f)
                curveToRelative(1.917f, 0.0f, 2.804f, -0.326f, 3.837f, -2.116f)
                lineToRelative(3.803f, -6.584f)
                reflectiveCurveToRelative(0.717f, -0.937f, 0.717f, -2.156f)
                reflectiveCurveToRelative(-0.717f, -2.146f, -0.717f, -2.146f)
                lineToRelative(-3.79f, -6.59f)
                curveToRelative(-1.034f, -1.79f, -1.924f, -2.116f, -3.84f, -2.116f)
                close()
                moveTo(8.368f, 3.934f)
                lineTo(8.502f, 3.937f)
                horizontalLineToRelative(7.0f)
                curveToRelative(0.74f, -0.02f, 1.174f, 0.048f, 1.605f, 0.795f)
                lineToRelative(1.116f, 1.932f)
                curveToRelative(0.223f, 0.386f, 0.031f, 0.502f, -0.147f, 0.502f)
                lineTo(8.97f, 7.166f)
                curveToRelative(-0.282f, 0.0f, -0.4f, 0.079f, -0.4f, 0.338f)
                verticalLineToRelative(3.102f)
                curveToRelative(0.0f, 0.258f, 0.118f, 0.337f, 0.4f, 0.337f)
                horizontalLineToRelative(11.379f)
                curveToRelative(0.176f, 0.0f, 0.757f, 0.145f, 0.756f, 1.016f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, true, -0.206f, 0.75f)
                lineToRelative(-0.634f, 1.1f)
                curveToRelative(-0.145f, 0.22f, -0.28f, 0.384f, -0.604f, 0.384f)
                lineTo(8.97f, 14.193f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.282f, 0.0f, -0.4f, 0.081f, -0.4f, 0.34f)
                verticalLineToRelative(5.137f)
                curveToRelative(0.0f, 0.197f, -0.122f, 0.394f, -0.464f, 0.394f)
                curveToRelative(-0.76f, 0.0f, -1.128f, -0.63f, -1.166f, -0.695f)
                lineToRelative(-2.908f, -5.035f)
                lineToRelative(-0.66f, -1.147f)
                curveToRelative(-0.657f, -1.137f, -0.654f, -1.216f, 0.0f, -2.35f)
                lineToRelative(2.41f, -4.175f)
                lineToRelative(1.115f, -1.932f)
                curveToRelative(0.405f, -0.7f, 0.811f, -0.805f, 1.471f, -0.798f)
            }
        }
        .build()
        return _floorp!!
    }

private var _floorp: ImageVector? = null
