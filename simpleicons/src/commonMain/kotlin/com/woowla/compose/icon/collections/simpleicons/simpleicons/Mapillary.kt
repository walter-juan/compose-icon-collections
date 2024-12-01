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

public val Simpleicons.Mapillary: ImageVector
    get() {
        if (_mapillary != null) {
            return _mapillary!!
        }
        _mapillary = Builder(name = "Mapillary", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.362f, 11.812f)
                curveToRelative(-0.564f, -0.305f, -0.46f, -1.099f, 0.25f, -1.302f)
                curveToRelative(0.602f, -0.17f, 5.495f, -1.81f, 6.975f, -2.308f)
                arcToRelative(0.897f, 0.897f, 0.0f, false, false, 0.565f, -0.558f)
                lineTo(10.528f, 0.671f)
                curveTo(10.75f, 0.02f, 11.555f, 0.017f, 11.884f, 0.65f)
                curveToRelative(0.117f, 0.224f, 4.546f, 8.25f, 4.7f, 8.591f)
                curveToRelative(0.154f, 0.341f, 0.055f, 0.718f, -0.295f, 0.935f)
                curveToRelative(-0.35f, 0.218f, -0.918f, 0.544f, -1.117f, 0.667f)
                curveToRelative(-0.36f, 0.223f, -0.704f, 0.068f, -0.869f, -0.277f)
                curveToRelative(-0.163f, -0.346f, -1.427f, -2.577f, -1.942f, -3.525f)
                curveToRelative(-0.258f, -0.472f, -1.033f, -0.654f, -1.295f, 0.111f)
                curveToRelative(-0.187f, 0.553f, -0.627f, 1.842f, -0.857f, 2.514f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -0.567f, 0.564f)
                lineToRelative(-2.582f, 0.855f)
                curveToRelative(-0.509f, 0.168f, -0.756f, 0.948f, -0.069f, 1.277f)
                curveToRelative(0.144f, 0.07f, 3.24f, 1.73f, 3.56f, 1.882f)
                curveToRelative(0.32f, 0.152f, 0.497f, 0.59f, 0.31f, 0.9f)
                curveToRelative(-0.255f, 0.425f, -0.582f, 0.962f, -0.7f, 1.138f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, true, -0.948f, 0.224f)
                curveToRelative(-0.34f, -0.179f, -8.651f, -4.584f, -8.853f, -4.692f)
                close()
                moveTo(22.89f, 23.722f)
                curveToRelative(-0.334f, -0.18f, -10.918f, -5.78f, -11.355f, -6.003f)
                curveToRelative(-0.436f, -0.222f, -0.542f, -0.606f, -0.308f, -1.021f)
                curveToRelative(0.118f, -0.211f, 0.376f, -0.633f, 0.586f, -0.972f)
                curveToRelative(0.288f, -0.467f, 0.709f, -0.468f, 0.946f, -0.33f)
                curveToRelative(0.238f, 0.138f, 3.598f, 1.906f, 3.816f, 2.025f)
                curveToRelative(0.512f, 0.284f, 1.27f, -0.363f, 0.93f, -0.93f)
                curveToRelative(-0.163f, -0.27f, -1.579f, -2.853f, -2.03f, -3.705f)
                curveToRelative(-0.203f, -0.387f, -0.147f, -0.736f, 0.31f, -0.968f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, false, 0.98f, -0.568f)
                curveToRelative(0.357f, -0.216f, 0.834f, -0.052f, 1.028f, 0.27f)
                curveToRelative(0.193f, 0.325f, 5.926f, 10.887f, 6.109f, 11.215f)
                curveToRelative(0.362f, 0.651f, -0.343f, 1.348f, -1.011f, 0.988f)
            }
        }
        .build()
        return _mapillary!!
    }

private var _mapillary: ImageVector? = null
