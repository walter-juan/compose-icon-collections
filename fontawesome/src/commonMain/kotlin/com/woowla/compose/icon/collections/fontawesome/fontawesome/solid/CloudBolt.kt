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

public val SolidGroup.CloudBolt: ImageVector
    get() {
        if (_cloudBolt != null) {
            return _cloudBolt!!
        }
        _cloudBolt = Builder(name = "CloudBolt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 224.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(38.6f, 0.0f)
                lineToRelative(124.1f, -111.0f)
                curveToRelative(12.2f, -10.9f, 28.0f, -17.0f, 44.4f, -17.0f)
                curveToRelative(44.6f, 0.0f, 76.5f, 43.0f, 63.7f, 85.7f)
                lineTo(354.1f, 320.0f)
                lineTo(416.0f, 320.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(-43.0f, -96.0f, -96.0f, -96.0f)
                curveToRelative(-0.5f, 0.0f, -1.1f, 0.0f, -1.6f, 0.0f)
                curveToRelative(1.1f, -5.2f, 1.6f, -10.5f, 1.6f, -16.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-24.3f, 0.0f, -46.1f, 10.9f, -60.8f, 28.0f)
                curveToRelative(-18.7f, -35.7f, -56.1f, -60.0f, -99.2f, -60.0f)
                curveToRelative(-61.9f, 0.0f, -112.0f, 50.1f, -112.0f, 112.0f)
                curveToRelative(0.0f, 7.1f, 0.7f, 14.1f, 1.9f, 20.8f)
                curveToRelative(-38.3f, 12.6f, -65.9f, 48.7f, -65.9f, 91.2f)
                close()
                moveTo(160.6f, 400.0f)
                lineToRelative(61.8f, 0.0f)
                lineToRelative(-31.2f, 104.1f)
                curveToRelative(-3.6f, 11.9f, 5.3f, 23.9f, 17.8f, 23.9f)
                curveToRelative(4.6f, 0.0f, 9.0f, -1.7f, 12.4f, -4.7f)
                lineTo(362.5f, 396.9f)
                curveToRelative(3.5f, -3.1f, 5.5f, -7.6f, 5.5f, -12.4f)
                curveToRelative(0.0f, -9.2f, -7.4f, -16.6f, -16.6f, -16.6f)
                lineToRelative(-61.8f, 0.0f)
                lineToRelative(31.2f, -104.1f)
                curveToRelative(3.6f, -11.9f, -5.3f, -23.9f, -17.8f, -23.9f)
                curveToRelative(-4.6f, 0.0f, -9.0f, 1.7f, -12.4f, 4.7f)
                lineTo(149.5f, 371.1f)
                curveToRelative(-3.5f, 3.1f, -5.5f, 7.6f, -5.5f, 12.4f)
                curveToRelative(0.0f, 9.2f, 7.4f, 16.6f, 16.6f, 16.6f)
                close()
            }
        }
        .build()
        return _cloudBolt!!
    }

private var _cloudBolt: ImageVector? = null
