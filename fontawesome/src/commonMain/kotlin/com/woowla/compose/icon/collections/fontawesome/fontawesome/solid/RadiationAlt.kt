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

public val SolidGroup.RadiationAlt: ImageVector
    get() {
        if (_radiationAlt != null) {
            return _radiationAlt!!
        }
        _radiationAlt = Builder(name = "RadiationAlt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 256.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, 512.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, true, -512.0f, 0.0f)
                close()
                moveTo(80.0f, 256.0f)
                lineToRelative(64.3f, 0.0f)
                curveToRelative(8.7f, 0.0f, 15.7f, -7.1f, 17.3f, -15.6f)
                curveToRelative(4.4f, -24.4f, 18.1f, -45.5f, 37.2f, -59.7f)
                curveToRelative(7.4f, -5.5f, 10.6f, -15.6f, 6.0f, -23.6f)
                lineToRelative(-32.5f, -56.3f)
                curveToRelative(-4.3f, -7.5f, -13.9f, -10.3f, -21.2f, -5.5f)
                curveToRelative(-48.2f, 31.5f, -81.3f, 84.2f, -86.3f, 144.8f)
                curveToRelative(-0.7f, 8.8f, 6.5f, 16.0f, 15.3f, 16.0f)
                close()
                moveTo(217.9f, 345.8f)
                curveToRelative(-8.5f, -3.7f, -18.8f, -1.4f, -23.5f, 6.6f)
                lineToRelative(-31.0f, 53.8f)
                curveToRelative(-4.3f, 7.5f, -1.9f, 17.2f, 5.8f, 21.1f)
                curveToRelative(26.1f, 13.2f, 55.5f, 20.7f, 86.8f, 20.7f)
                reflectiveCurveToRelative(60.7f, -7.5f, 86.8f, -20.7f)
                curveToRelative(7.7f, -3.9f, 10.1f, -13.6f, 5.8f, -21.1f)
                lineToRelative(-31.0f, -53.8f)
                curveToRelative(-4.6f, -8.0f, -15.0f, -10.3f, -23.5f, -6.6f)
                curveToRelative(-11.7f, 5.0f, -24.5f, 7.8f, -38.1f, 7.8f)
                reflectiveCurveToRelative(-26.4f, -2.8f, -38.1f, -7.8f)
                close()
                moveTo(350.4f, 240.4f)
                curveToRelative(1.6f, 8.6f, 8.5f, 15.6f, 17.3f, 15.6f)
                lineToRelative(64.3f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.1f, -7.2f, 15.3f, -16.0f)
                curveToRelative(-5.0f, -60.6f, -38.1f, -113.2f, -86.3f, -144.8f)
                curveToRelative(-7.3f, -4.8f, -16.8f, -2.0f, -21.2f, 5.5f)
                lineTo(307.3f, 157.0f)
                curveToRelative(-4.6f, 8.0f, -1.4f, 18.1f, 6.0f, 23.6f)
                curveToRelative(19.1f, 14.2f, 32.7f, 35.4f, 37.2f, 59.7f)
                close()
                moveTo(256.0f, 305.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
            }
        }
        .build()
        return _radiationAlt!!
    }

private var _radiationAlt: ImageVector? = null
