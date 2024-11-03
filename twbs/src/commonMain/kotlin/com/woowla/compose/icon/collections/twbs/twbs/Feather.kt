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

public val Twbs.Feather: ImageVector
    get() {
        if (_feather != null) {
            return _feather!!
        }
        _feather = Builder(name = "Feather", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.807f, 0.531f)
                curveToRelative(-0.174f, -0.177f, -0.41f, -0.289f, -0.64f, -0.363f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.833f, -0.15f)
                curveToRelative(-0.62f, -0.049f, -1.394f, 0.0f, -2.252f, 0.175f)
                curveTo(10.365f, 0.545f, 8.264f, 1.415f, 6.315f, 3.1f)
                reflectiveCurveTo(3.147f, 6.824f, 2.557f, 8.523f)
                curveToRelative(-0.294f, 0.847f, -0.44f, 1.634f, -0.429f, 2.268f)
                curveToRelative(0.005f, 0.316f, 0.05f, 0.62f, 0.154f, 0.88f)
                quadToRelative(0.025f, 0.061f, 0.056f, 0.122f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 0.08f, 15.198f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.157f, 0.72f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, false, 0.705f, -0.16f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 2.158f, -3.26f)
                curveToRelative(0.285f, 0.141f, 0.616f, 0.195f, 0.958f, 0.182f)
                curveToRelative(0.513f, -0.02f, 1.098f, -0.188f, 1.723f, -0.49f)
                curveToRelative(1.25f, -0.605f, 2.744f, -1.787f, 4.303f, -3.642f)
                lineToRelative(1.518f, -1.55f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.0f, -0.739f)
                lineToRelative(-0.729f, -0.744f)
                lineToRelative(1.311f, 0.209f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.443f, -0.15f)
                lineToRelative(0.663f, -0.684f)
                curveToRelative(0.663f, -0.68f, 1.292f, -1.325f, 1.763f, -1.892f)
                curveToRelative(0.314f, -0.378f, 0.585f, -0.752f, 0.754f, -1.107f)
                curveToRelative(0.163f, -0.345f, 0.278f, -0.773f, 0.112f, -1.188f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.112f, -0.172f)
                moveTo(3.733f, 11.62f)
                curveTo(5.385f, 9.374f, 7.24f, 7.215f, 9.309f, 5.394f)
                lineToRelative(1.21f, 1.234f)
                lineToRelative(-1.171f, 1.196f)
                lineToRelative(-0.027f, 0.03f)
                curveToRelative(-1.5f, 1.789f, -2.891f, 2.867f, -3.977f, 3.393f)
                curveToRelative(-0.544f, 0.263f, -0.99f, 0.378f, -1.324f, 0.39f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.287f, -0.018f)
                close()
                moveTo(10.502f, 4.4f)
                curveToRelative(1.31f, -1.028f, 2.7f, -1.914f, 4.172f, -2.6f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -0.4f, 0.523f)
                curveToRelative(-0.442f, 0.533f, -1.028f, 1.134f, -1.681f, 1.804f)
                lineToRelative(-0.51f, 0.524f)
                close()
                moveTo(13.848f, 1.043f)
                curveTo(9.594f, 3.147f, 6.045f, 6.8f, 3.149f, 10.678f)
                curveToRelative(0.007f, -0.464f, 0.121f, -1.086f, 0.37f, -1.806f)
                curveToRelative(0.533f, -1.535f, 1.65f, -3.415f, 3.455f, -4.976f)
                curveToRelative(1.807f, -1.561f, 3.746f, -2.36f, 5.31f, -2.68f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.564f, -0.173f)
            }
        }
        .build()
        return _feather!!
    }

private var _feather: ImageVector? = null
