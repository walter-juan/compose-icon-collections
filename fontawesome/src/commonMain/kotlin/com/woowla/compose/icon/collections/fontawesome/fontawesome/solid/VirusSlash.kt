package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.VirusSlash: ImageVector
    get() {
        if (_virusSlash != null) {
            return _virusSlash!!
        }
        _virusSlash = Builder(name = "VirusSlash", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, -24.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                reflectiveCurveTo(-2.3f, -0.3f, 7.0f, 9.1f)
                lineToRelative(528.0f, 528.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(-88.6f, -88.6f)
                curveToRelative(1.7f, -12.1f, -2.0f, -24.8f, -11.3f, -34.0f)
                curveToRelative(-31.2f, -31.2f, -9.1f, -84.5f, 35.0f, -84.5f)
                curveToRelative(22.1f, 0.0f, 40.0f, -17.9f, 40.0f, -40.0f)
                reflectiveCurveToRelative(-17.9f, -40.0f, -40.0f, -40.0f)
                curveToRelative(-44.1f, 0.0f, -66.1f, -53.3f, -35.0f, -84.5f)
                curveToRelative(15.6f, -15.6f, 15.6f, -40.9f, 0.0f, -56.6f)
                reflectiveCurveToRelative(-40.9f, -15.6f, -56.6f, 0.0f)
                curveToRelative(-31.2f, 31.2f, -84.5f, 9.1f, -84.5f, -35.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                reflectiveCurveToRelative(-40.0f, 17.9f, -40.0f, 40.0f)
                curveToRelative(0.0f, 44.1f, -53.3f, 66.1f, -84.5f, 35.0f)
                curveToRelative(-9.3f, -9.3f, -22.0f, -13.0f, -34.0f, -11.3f)
                lineTo(41.0f, -24.9f)
                close()
                moveTo(72.0f, 216.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                curveToRelative(44.1f, 0.0f, 66.1f, 53.3f, 35.0f, 84.5f)
                curveToRelative(-15.6f, 15.6f, -15.6f, 40.9f, 0.0f, 56.6f)
                reflectiveCurveToRelative(40.9f, 15.6f, 56.6f, 0.0f)
                curveToRelative(31.2f, -31.2f, 84.5f, -9.1f, 84.5f, 35.0f)
                curveToRelative(0.0f, 22.1f, 17.9f, 40.0f, 40.0f, 40.0f)
                reflectiveCurveToRelative(40.0f, -17.9f, 40.0f, -40.0f)
                curveToRelative(0.0f, -21.4f, 12.6f, -37.6f, 29.1f, -45.1f)
                lineToRelative(-240.0f, -240.0f)
                curveTo(109.6f, 203.4f, 93.4f, 216.0f, 72.0f, 216.0f)
                close()
            }
        }
        .build()
        return _virusSlash!!
    }

private var _virusSlash: ImageVector? = null
