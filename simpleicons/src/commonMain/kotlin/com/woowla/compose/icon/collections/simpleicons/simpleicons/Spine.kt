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

public val Simpleicons.Spine: ImageVector
    get() {
        if (_spine != null) {
            return _spine!!
        }
        _spine = Builder(name = "Spine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.157f, 2.207f)
                curveToRelative(0.066f, 2.004f, 1.454f, 3.117f, 4.221f, 3.55f)
                curveToRelative(2.345f, 0.368f, 4.46f, 0.181f, 5.151f, -1.829f)
                curveTo(17.874f, 0.01f, 14.681f, 0.985f, 11.915f, 0.55f)
                reflectiveCurveTo(7.051f, -1.013f, 7.157f, 2.207f)
                moveToRelative(0.831f, 8.23f)
                curveToRelative(0.257f, 1.497f, 1.652f, 2.355f, 3.786f, 2.297f)
                curveToRelative(2.135f, -0.059f, 3.728f, -0.892f, 3.949f, -2.507f)
                curveToRelative(0.409f, -2.988f, -1.946f, -1.832f, -4.08f, -1.774f)
                curveToRelative(-2.136f, 0.059f, -4.161f, -0.952f, -3.655f, 1.984f)
                moveToRelative(2.778f, 6.852f)
                curveToRelative(0.424f, 1.117f, 1.587f, 1.589f, 3.159f, 1.253f)
                curveToRelative(1.569f, -0.335f, 2.656f, -0.856f, 2.568f, -2.129f)
                curveToRelative(-0.159f, -2.357f, -1.713f, -1.616f, -3.283f, -1.279f)
                curveToRelative(-1.571f, 0.333f, -3.272f, -0.039f, -2.444f, 2.155f)
                moveToRelative(1.348f, 5.221f)
                curveToRelative(0.123f, 0.943f, 0.939f, 1.5f, 2.215f, 1.49f)
                curveToRelative(1.279f, -0.011f, 2.248f, -0.515f, 2.412f, -1.525f)
                curveToRelative(0.308f, -1.871f, -1.123f, -1.175f, -2.4f, -1.165f)
                curveToRelative(-1.28f, 0.01f, -2.47f, -0.65f, -2.227f, 1.2f)
            }
        }
        .build()
        return _spine!!
    }

private var _spine: ImageVector? = null
