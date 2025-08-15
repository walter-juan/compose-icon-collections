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

public val SolidGroup.PersonRifle: ImageVector
    get() {
        if (_personRifle != null) {
            return _personRifle!!
        }
        _personRifle = Builder(name = "PersonRifle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 0.0f)
                lineTo(384.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(0.0f, 100.3f)
                curveToRelative(-9.6f, 5.5f, -16.0f, 15.9f, -16.0f, 27.7f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 144.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                lineToRelative(59.5f, 0.0f)
                curveToRelative(10.4f, 0.0f, 18.0f, -9.8f, 15.5f, -19.9f)
                lineToRelative(-23.0f, -92.1f)
                lineToRelative(44.0f, 0.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, -26.7f)
                lineToRelative(53.1f, -17.7f)
                curveToRelative(6.5f, -2.2f, 10.9f, -8.3f, 10.9f, -15.2f)
                lineToRelative(0.0f, -84.5f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-16.0f, 5.3f)
                lineToRelative(0.0f, -109.3f)
                curveToRelative(0.0f, -11.8f, -6.4f, -22.2f, -16.0f, -27.7f)
                lineTo(432.0f, 16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(224.0f, 208.0f)
                curveTo(118.0f, 208.0f, 32.0f, 294.0f, 32.0f, 400.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -32.5f, 12.1f, -62.1f, 32.0f, -84.7f)
                lineToRelative(0.0f, 196.7f)
                lineToRelative(160.0f, 0.0f)
                lineToRelative(0.0f, -293.1f)
                curveToRelative(-20.0f, -7.1f, -41.6f, -10.9f, -64.0f, -10.9f)
                close()
                moveTo(280.0f, 88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, -144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, false, 144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personRifle!!
    }

private var _personRifle: ImageVector? = null
