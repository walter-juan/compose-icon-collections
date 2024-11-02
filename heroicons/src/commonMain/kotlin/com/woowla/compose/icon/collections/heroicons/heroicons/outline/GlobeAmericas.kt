package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.GlobeAmericas: ImageVector
    get() {
        if (_globeAmericas != null) {
            return _globeAmericas!!
        }
        _globeAmericas = Builder(name = "GlobeAmericas", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.115f, 5.19f)
                lineTo(6.434f, 7.103f)
                curveTo(6.639f, 8.337f, 7.225f, 9.475f, 8.11f, 10.36f)
                lineTo(9.75f, 12.0f)
                lineTo(9.363f, 12.775f)
                curveTo(9.146f, 13.208f, 9.231f, 13.731f, 9.573f, 14.073f)
                lineTo(10.92f, 15.42f)
                curveTo(11.132f, 15.632f, 11.25f, 15.918f, 11.25f, 16.216f)
                verticalLineTo(17.305f)
                curveTo(11.25f, 17.731f, 11.491f, 18.12f, 11.872f, 18.311f)
                lineTo(12.025f, 18.387f)
                curveTo(12.458f, 18.604f, 12.981f, 18.519f, 13.323f, 18.177f)
                lineTo(14.046f, 17.454f)
                curveTo(15.161f, 16.339f, 15.952f, 14.942f, 16.334f, 13.412f)
                curveTo(16.436f, 13.007f, 16.296f, 12.58f, 15.976f, 12.313f)
                lineTo(14.646f, 11.205f)
                curveTo(14.395f, 10.996f, 14.064f, 10.906f, 13.741f, 10.96f)
                lineTo(12.571f, 11.155f)
                curveTo(12.213f, 11.215f, 11.847f, 11.097f, 11.591f, 10.841f)
                lineTo(11.295f, 10.545f)
                curveTo(10.856f, 10.106f, 10.856f, 9.394f, 11.295f, 8.955f)
                lineTo(11.427f, 8.823f)
                curveTo(11.769f, 8.481f, 12.292f, 8.396f, 12.725f, 8.613f)
                lineTo(13.329f, 8.915f)
                curveTo(13.441f, 8.971f, 13.565f, 9.0f, 13.691f, 9.0f)
                curveTo(14.292f, 9.0f, 14.684f, 8.367f, 14.415f, 7.829f)
                lineTo(14.25f, 7.5f)
                lineTo(15.506f, 6.663f)
                curveTo(16.157f, 6.228f, 16.684f, 5.632f, 17.034f, 4.931f)
                lineTo(17.18f, 4.639f)
                moveTo(6.115f, 5.19f)
                curveTo(4.207f, 6.841f, 3.0f, 9.279f, 3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(16.971f, 21.0f, 21.0f, 16.971f, 21.0f, 12.0f)
                curveTo(21.0f, 8.958f, 19.491f, 6.269f, 17.18f, 4.639f)
                moveTo(6.115f, 5.19f)
                curveTo(7.693f, 3.826f, 9.75f, 3.0f, 12.0f, 3.0f)
                curveTo(13.929f, 3.0f, 15.715f, 3.607f, 17.18f, 4.639f)
            }
        }
        .build()
        return _globeAmericas!!
    }

private var _globeAmericas: ImageVector? = null
