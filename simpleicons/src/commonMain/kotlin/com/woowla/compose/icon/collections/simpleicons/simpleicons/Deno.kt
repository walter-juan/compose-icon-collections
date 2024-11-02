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

public val Simpleicons.Deno: ImageVector
    get() {
        if (_deno != null) {
            return _deno!!
        }
        _deno = Builder(name = "Deno", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.105f, 18.02f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 0.0f, 12.985f)
                quadToRelative(0.0f, -0.698f, 0.078f, -1.376f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.231f, -1.34f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 4.025f, 4.02f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.46f, -2.771f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 3.428f, -0.23f)
                curveToRelative(1.452f, 0.112f, 2.825f, 0.477f, 4.077f, 1.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.78f, 1.774f)
                arcToRelative(12.02f, 12.02f, 0.0f, false, true, 4.053f, 7.078f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 24.0f, 12.985f)
                quadToRelative(0.0f, 0.454f, -0.036f, 0.914f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.728f, 3.305f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.38f, 3.875f)
                curveToRelative(-1.33f, 1.357f, -3.02f, 1.962f, -4.43f, 1.936f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.724f, -1.024f)
                curveToRelative(-0.99f, -0.853f, -1.391f, -1.83f, -1.53f, -2.919f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.128f, -1.518f)
                curveToRelative(0.105f, -0.38f, 0.37f, -1.116f, 0.76f, -1.437f)
                curveToRelative(-0.455f, -0.197f, -1.04f, -0.624f, -1.226f, -0.829f)
                curveToRelative(-0.045f, -0.05f, -0.04f, -0.13f, 0.0f, -0.183f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, true, 0.177f, -0.053f)
                curveToRelative(0.392f, 0.134f, 0.869f, 0.267f, 1.372f, 0.35f)
                curveToRelative(0.66f, 0.111f, 1.484f, 0.25f, 2.317f, 0.292f)
                curveToRelative(2.03f, 0.1f, 4.153f, -0.813f, 4.812f, -2.627f)
                reflectiveCurveToRelative(0.403f, -3.609f, -1.96f, -4.685f)
                reflectiveCurveToRelative(-3.454f, -2.356f, -5.363f, -3.128f)
                curveToRelative(-1.247f, -0.505f, -2.636f, -0.205f, -4.06f, 0.582f)
                curveToRelative(-3.838f, 2.121f, -7.277f, 8.822f, -5.69f, 15.032f)
                arcToRelative(0.191f, 0.191f, 0.0f, false, true, -0.315f, 0.19f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -1.25f, -1.634f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -0.769f, -1.404f)
                moveTo(11.57f, 6.087f)
                curveToRelative(0.649f, -0.051f, 1.214f, 0.501f, 1.31f, 1.236f)
                curveToRelative(0.13f, 0.979f, -0.228f, 1.99f, -1.41f, 2.013f)
                curveToRelative(-1.01f, 0.02f, -1.315f, -0.997f, -1.248f, -1.614f)
                curveToRelative(0.066f, -0.616f, 0.574f, -1.575f, 1.35f, -1.635f)
            }
        }
        .build()
        return _deno!!
    }

private var _deno: ImageVector? = null
