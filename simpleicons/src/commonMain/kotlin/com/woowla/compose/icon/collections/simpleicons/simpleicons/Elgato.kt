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

public val Simpleicons.Elgato: ImageVector
    get() {
        if (_elgato != null) {
            return _elgato!!
        }
        _elgato = Builder(name = "Elgato", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.882f, 8.396f)
                lineToRelative(0.026f, 0.02f)
                lineToRelative(9.949f, 5.717f)
                curveToRelative(-0.488f, 2.729f, -1.92f, 5.222f, -4.038f, 7.025f)
                arcTo(11.926f, 11.926f, 0.0f, false, true, 12.097f, 24.0f)
                curveToRelative(-3.193f, 0.0f, -6.194f, -1.248f, -8.453f, -3.514f)
                curveTo(1.387f, 18.219f, 0.143f, 15.204f, 0.143f, 12.0f)
                curveToRelative(0.0f, -3.204f, 1.244f, -6.219f, 3.501f, -8.485f)
                curveTo(5.902f, 1.248f, 8.903f, 0.0f, 12.097f, 0.0f)
                curveToRelative(2.439f, 0.0f, 4.785f, 0.733f, 6.783f, 2.119f)
                curveToRelative(1.953f, 1.354f, 3.447f, 3.236f, 4.323f, 5.442f)
                curveToRelative(0.111f, 0.283f, 0.215f, 0.574f, 0.305f, 0.866f)
                lineToRelative(-2.125f, 1.236f)
                arcToRelative(9.492f, 9.492f, 0.0f, false, false, -0.262f, -0.869f)
                curveToRelative(-1.354f, -3.83f, -4.981f, -6.405f, -9.024f, -6.405f)
                curveTo(6.817f, 2.388f, 2.522f, 6.701f, 2.522f, 12.0f)
                curveToRelative(0.0f, 5.299f, 4.295f, 9.611f, 9.575f, 9.611f)
                curveToRelative(2.052f, 0.0f, 4.008f, -0.644f, 5.66f, -1.865f)
                curveToRelative(1.617f, -1.196f, 2.804f, -2.834f, 3.431f, -4.736f)
                lineToRelative(0.007f, -0.042f)
                lineTo(9.591f, 8.305f)
                verticalLineToRelative(7.226f)
                lineToRelative(4.0f, -2.314f)
                lineToRelative(2.06f, 1.181f)
                lineToRelative(-5.996f, 3.469f)
                lineToRelative(-2.12f, -1.213f)
                verticalLineTo(7.194f)
                lineToRelative(2.117f, -1.224f)
                lineToRelative(4.231f, 2.428f)
                lineToRelative(-0.001f, -0.001f)
            }
        }
        .build()
        return _elgato!!
    }

private var _elgato: ImageVector? = null
