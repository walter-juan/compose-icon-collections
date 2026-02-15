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

public val Simpleicons.Deezer: ImageVector
    get() {
        if (_deezer != null) {
            return _deezer!!
        }
        _deezer = Builder(name = "Deezer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.693f, 10.024f)
                curveToRelative(0.381f, 0.0f, 0.693f, -1.256f, 0.693f, -2.807f)
                curveToRelative(0.0f, -1.55f, -0.312f, -2.807f, -0.693f, -2.807f)
                curveTo(0.312f, 4.41f, 0.0f, 5.666f, 0.0f, 7.217f)
                reflectiveCurveToRelative(0.312f, 2.808f, 0.693f, 2.808f)
                close()
                moveTo(21.038f, 1.56f)
                curveToRelative(-0.364f, 0.0f, -0.684f, 0.805f, -0.91f, 2.096f)
                curveTo(19.765f, 1.446f, 19.184f, 0.0f, 18.526f, 0.0f)
                curveToRelative(-0.78f, 0.0f, -1.464f, 2.036f, -1.784f, 5.0f)
                curveToRelative(-0.312f, -2.158f, -0.788f, -3.536f, -1.325f, -3.536f)
                curveToRelative(-0.745f, 0.0f, -1.386f, 2.704f, -1.62f, 6.472f)
                curveToRelative(-0.442f, -1.932f, -1.083f, -3.145f, -1.793f, -3.145f)
                reflectiveCurveToRelative(-1.35f, 1.213f, -1.793f, 3.145f)
                curveToRelative(-0.242f, -3.76f, -0.874f, -6.463f, -1.628f, -6.463f)
                curveToRelative(-0.537f, 0.0f, -1.013f, 1.378f, -1.325f, 3.535f)
                curveTo(6.938f, 2.036f, 6.262f, 0.0f, 5.474f, 0.0f)
                curveToRelative(-0.658f, 0.0f, -1.247f, 1.447f, -1.602f, 3.665f)
                curveToRelative(-0.217f, -1.291f, -0.546f, -2.105f, -0.91f, -2.105f)
                curveToRelative(-0.675f, 0.0f, -1.221f, 2.807f, -1.221f, 6.272f)
                curveToRelative(0.0f, 3.466f, 0.546f, 6.273f, 1.221f, 6.273f)
                curveToRelative(0.277f, 0.0f, 0.537f, -0.476f, 0.736f, -1.273f)
                curveToRelative(0.32f, 2.928f, 0.996f, 4.938f, 1.776f, 4.938f)
                curveToRelative(0.606f, 0.0f, 1.143f, -1.204f, 1.507f, -3.11f)
                curveToRelative(0.251f, 3.622f, 0.875f, 6.195f, 1.602f, 6.195f)
                curveToRelative(0.46f, 0.0f, 0.875f, -1.023f, 1.187f, -2.677f)
                curveTo(10.142f, 21.6f, 11.0f, 24.0f, 12.004f, 24.0f)
                curveToRelative(1.005f, 0.0f, 1.863f, -2.4f, 2.235f, -5.822f)
                curveToRelative(0.312f, 1.654f, 0.727f, 2.677f, 1.186f, 2.677f)
                curveToRelative(0.728f, 0.0f, 1.352f, -2.573f, 1.603f, -6.195f)
                curveToRelative(0.364f, 1.906f, 0.9f, 3.11f, 1.507f, 3.11f)
                curveToRelative(0.78f, 0.0f, 1.455f, -2.01f, 1.775f, -4.938f)
                curveToRelative(0.208f, 0.797f, 0.46f, 1.273f, 0.737f, 1.273f)
                curveToRelative(0.675f, 0.0f, 1.22f, -2.807f, 1.22f, -6.273f)
                curveToRelative(-0.008f, -3.457f, -0.553f, -6.272f, -1.23f, -6.272f)
                close()
                moveTo(23.307f, 10.024f)
                curveToRelative(0.381f, 0.0f, 0.693f, -1.256f, 0.693f, -2.807f)
                curveToRelative(0.0f, -1.55f, -0.312f, -2.807f, -0.693f, -2.807f)
                curveToRelative(-0.381f, 0.0f, -0.693f, 1.256f, -0.693f, 2.807f)
                reflectiveCurveToRelative(0.312f, 2.808f, 0.693f, 2.808f)
                close()
            }
        }
        .build()
        return _deezer!!
    }

private var _deezer: ImageVector? = null
