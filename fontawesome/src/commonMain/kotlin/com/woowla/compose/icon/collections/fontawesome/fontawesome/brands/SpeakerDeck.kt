package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.SpeakerDeck: ImageVector
    get() {
        if (_speakerDeck != null) {
            return _speakerDeck!!
        }
        _speakerDeck = Builder(name = "SpeakerDeck", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.9f, 296.0f)
                lineTo(100.0f, 296.0f)
                curveToRelative(-26.5f, 0.0f, -52.0f, -10.5f, -70.7f, -29.3f)
                reflectiveCurveTo(0.0f, 222.5f, 0.0f, 196.0f)
                reflectiveCurveTo(10.5f, 144.0f, 29.3f, 125.3f)
                reflectiveCurveTo(73.5f, 96.0f, 100.0f, 96.0f)
                lineToRelative(132.8f, 0.0f)
                curveToRelative(10.6f, 0.0f, 20.8f, 4.2f, 28.3f, 11.7f)
                reflectiveCurveToRelative(11.7f, 17.7f, 11.7f, 28.3f)
                reflectiveCurveToRelative(-4.2f, 20.8f, -11.7f, 28.3f)
                reflectiveCurveToRelative(-17.7f, 11.7f, -28.3f, 11.7f)
                lineTo(98.0f, 176.0f)
                curveToRelative(-26.5f, 0.0f, -26.4f, 40.0f, 0.0f, 40.0f)
                lineToRelative(113.8f, 0.0f)
                curveToRelative(26.5f, 0.0f, 52.0f, 10.5f, 70.7f, 29.3f)
                reflectiveCurveToRelative(29.3f, 44.2f, 29.3f, 70.7f)
                reflectiveCurveToRelative(-10.5f, 52.0f, -29.3f, 70.7f)
                reflectiveCurveToRelative(-44.2f, 29.3f, -70.7f, 29.3f)
                lineTo(40.0f, 416.0f)
                curveToRelative(-10.6f, 0.0f, -20.8f, -4.2f, -28.3f, -11.7f)
                reflectiveCurveTo(0.0f, 386.6f, 0.0f, 376.0f)
                reflectiveCurveTo(4.2f, 355.2f, 11.7f, 347.7f)
                reflectiveCurveTo(29.4f, 336.0f, 40.0f, 336.0f)
                lineToRelative(173.9f, 0.0f)
                curveToRelative(26.5f, 0.0f, 26.5f, -40.0f, 0.0f, -40.0f)
                close()
                moveTo(298.0f, 416.0f)
                curveToRelative(13.5f, -9.2f, 25.0f, -21.0f, 33.8f, -34.7f)
                reflectiveCurveToRelative(14.7f, -29.2f, 17.3f, -45.3f)
                lineToRelative(64.6f, 0.0f)
                curveToRelative(2.6f, 0.0f, 5.2f, -0.6f, 7.6f, -1.6f)
                reflectiveCurveToRelative(4.6f, -2.5f, 6.4f, -4.4f)
                reflectiveCurveToRelative(3.3f, -4.1f, 4.2f, -6.5f)
                reflectiveCurveToRelative(1.5f, -5.0f, 1.4f, -7.6f)
                lineToRelative(0.0f, -120.0f)
                curveToRelative(0.0f, -2.6f, -0.5f, -5.2f, -1.4f, -7.6f)
                reflectiveCurveToRelative(-2.4f, -4.6f, -4.2f, -6.5f)
                reflectiveCurveToRelative(-4.0f, -3.3f, -6.4f, -4.4f)
                reflectiveCurveToRelative(-5.0f, -1.6f, -7.6f, -1.6f)
                lineToRelative(-117.2f, 0.0f)
                curveToRelative(9.7f, -11.1f, 15.0f, -25.3f, 15.0f, -40.0f)
                reflectiveCurveToRelative(-5.3f, -28.9f, -15.0f, -40.0f)
                lineToRelative(136.9f, 0.0f)
                curveToRelative(43.4f, 0.0f, 78.6f, 35.8f, 78.6f, 80.0f)
                lineToRelative(0.0f, 160.0f)
                curveToRelative(0.0f, 44.2f, -35.2f, 80.0f, -78.6f, 80.0f)
                lineTo(298.0f, 416.0f)
                close()
            }
        }
        .build()
        return _speakerDeck!!
    }

private var _speakerDeck: ImageVector? = null
