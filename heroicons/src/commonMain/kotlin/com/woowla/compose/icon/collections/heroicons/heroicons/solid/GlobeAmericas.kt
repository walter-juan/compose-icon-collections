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

public val SolidGroup.GlobeAmericas: ImageVector
    get() {
        if (_globeAmericas != null) {
            return _globeAmericas!!
        }
        _globeAmericas = Builder(name = "GlobeAmericas", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(6.262f, 6.072f)
                curveTo(4.713f, 7.572f, 3.75f, 9.674f, 3.75f, 12.0f)
                curveTo(3.75f, 16.556f, 7.444f, 20.25f, 12.0f, 20.25f)
                curveTo(16.556f, 20.25f, 20.25f, 16.556f, 20.25f, 12.0f)
                curveTo(20.25f, 9.245f, 18.899f, 6.805f, 16.824f, 5.306f)
                curveTo(16.486f, 5.845f, 16.037f, 6.308f, 15.506f, 6.663f)
                lineTo(14.25f, 7.5f)
                lineTo(14.415f, 7.829f)
                curveTo(14.684f, 8.367f, 14.292f, 9.0f, 13.691f, 9.0f)
                curveTo(13.565f, 9.0f, 13.441f, 8.971f, 13.329f, 8.915f)
                lineTo(12.725f, 8.613f)
                curveTo(12.292f, 8.396f, 11.769f, 8.481f, 11.427f, 8.823f)
                lineTo(11.295f, 8.955f)
                curveTo(10.856f, 9.394f, 10.856f, 10.106f, 11.295f, 10.545f)
                lineTo(11.59f, 10.841f)
                curveTo(11.847f, 11.097f, 12.213f, 11.215f, 12.571f, 11.155f)
                lineTo(13.741f, 10.96f)
                curveTo(14.064f, 10.906f, 14.395f, 10.996f, 14.646f, 11.205f)
                lineTo(15.976f, 12.313f)
                curveTo(16.296f, 12.58f, 16.436f, 13.007f, 16.334f, 13.412f)
                curveTo(15.952f, 14.942f, 15.161f, 16.339f, 14.046f, 17.454f)
                lineTo(13.323f, 18.177f)
                curveTo(12.981f, 18.519f, 12.458f, 18.604f, 12.025f, 18.387f)
                lineTo(11.872f, 18.311f)
                curveTo(11.491f, 18.12f, 11.25f, 17.731f, 11.25f, 17.305f)
                verticalLineTo(16.216f)
                curveTo(11.25f, 15.918f, 11.131f, 15.632f, 10.92f, 15.42f)
                lineTo(9.573f, 14.073f)
                curveTo(9.231f, 13.731f, 9.146f, 13.208f, 9.363f, 12.775f)
                lineTo(9.75f, 12.0f)
                lineTo(8.11f, 10.36f)
                curveTo(7.225f, 9.475f, 6.639f, 8.337f, 6.434f, 7.103f)
                lineTo(6.262f, 6.072f)
                close()
            }
        }
        .build()
        return _globeAmericas!!
    }

private var _globeAmericas: ImageVector? = null
