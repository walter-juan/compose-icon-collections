package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.Language: ImageVector
    get() {
        if (_language != null) {
            return _language!!
        }
        _language = Builder(name = "Language", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.0f, 2.25f)
                curveTo(9.414f, 2.25f, 9.75f, 2.586f, 9.75f, 3.0f)
                verticalLineTo(4.506f)
                curveTo(10.634f, 4.519f, 11.513f, 4.556f, 12.386f, 4.616f)
                curveTo(13.295f, 4.678f, 14.198f, 4.766f, 15.093f, 4.877f)
                curveTo(15.504f, 4.928f, 15.795f, 5.303f, 15.744f, 5.714f)
                curveTo(15.693f, 6.125f, 15.318f, 6.417f, 14.907f, 6.366f)
                curveTo(14.248f, 6.283f, 13.584f, 6.215f, 12.916f, 6.16f)
                curveTo(12.325f, 8.47f, 11.306f, 10.607f, 9.948f, 12.483f)
                curveTo(10.265f, 12.867f, 10.598f, 13.236f, 10.946f, 13.59f)
                curveTo(11.236f, 13.886f, 11.232f, 14.361f, 10.937f, 14.651f)
                curveTo(10.642f, 14.941f, 10.167f, 14.937f, 9.876f, 14.642f)
                curveTo(9.573f, 14.334f, 9.281f, 14.015f, 9.0f, 13.687f)
                curveTo(7.429f, 15.522f, 5.509f, 17.05f, 3.344f, 18.169f)
                curveTo(2.976f, 18.359f, 2.524f, 18.215f, 2.334f, 17.847f)
                curveTo(2.144f, 17.479f, 2.288f, 17.026f, 2.656f, 16.836f)
                curveTo(4.738f, 15.76f, 6.572f, 14.274f, 8.052f, 12.483f)
                curveTo(7.186f, 11.287f, 6.458f, 9.984f, 5.89f, 8.598f)
                curveTo(5.733f, 8.214f, 5.917f, 7.776f, 6.3f, 7.62f)
                curveTo(6.684f, 7.463f, 7.122f, 7.646f, 7.278f, 8.03f)
                curveTo(7.741f, 9.159f, 8.32f, 10.229f, 9.0f, 11.224f)
                curveTo(10.065f, 9.667f, 10.881f, 7.926f, 11.391f, 6.059f)
                curveTo(10.599f, 6.02f, 9.802f, 6.0f, 9.0f, 6.0f)
                curveTo(6.999f, 6.0f, 5.028f, 6.124f, 3.093f, 6.366f)
                curveTo(2.682f, 6.417f, 2.307f, 6.125f, 2.256f, 5.714f)
                curveTo(2.204f, 5.303f, 2.496f, 4.928f, 2.907f, 4.877f)
                curveTo(4.661f, 4.658f, 6.444f, 4.533f, 8.25f, 4.506f)
                verticalLineTo(3.0f)
                curveTo(8.25f, 2.586f, 8.586f, 2.25f, 9.0f, 2.25f)
                close()
                moveTo(15.75f, 9.0f)
                curveTo(16.041f, 9.0f, 16.306f, 9.169f, 16.43f, 9.433f)
                lineTo(21.68f, 20.683f)
                curveTo(21.855f, 21.058f, 21.692f, 21.504f, 21.317f, 21.68f)
                curveTo(20.942f, 21.855f, 20.496f, 21.692f, 20.32f, 21.317f)
                lineTo(19.122f, 18.75f)
                horizontalLineTo(12.378f)
                lineTo(11.18f, 21.317f)
                curveTo(11.004f, 21.692f, 10.558f, 21.855f, 10.183f, 21.68f)
                curveTo(9.807f, 21.504f, 9.645f, 21.058f, 9.82f, 20.683f)
                lineTo(15.07f, 9.433f)
                curveTo(15.194f, 9.169f, 15.459f, 9.0f, 15.75f, 9.0f)
                close()
                moveTo(13.078f, 17.25f)
                horizontalLineTo(18.422f)
                lineTo(15.75f, 11.524f)
                lineTo(13.078f, 17.25f)
                close()
            }
        }
        .build()
        return _language!!
    }

private var _language: ImageVector? = null
