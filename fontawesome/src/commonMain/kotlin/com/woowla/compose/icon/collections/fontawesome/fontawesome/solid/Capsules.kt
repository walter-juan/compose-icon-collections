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

public val SolidGroup.Capsules: ImageVector
    get() {
        if (_capsules != null) {
            return _capsules!!
        }
        _capsules = Builder(name = "Capsules", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 112.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -112.0f)
                close()
                moveTo(32.0f, 112.0f)
                lineToRelative(0.0f, 288.0f)
                curveToRelative(0.0f, 61.9f, 50.1f, 112.0f, 112.0f, 112.0f)
                reflectiveCurveToRelative(112.0f, -50.1f, 112.0f, -112.0f)
                lineToRelative(0.0f, -105.8f)
                lineToRelative(116.3f, 169.5f)
                curveToRelative(35.5f, 51.7f, 105.3f, 64.3f, 156.0f, 28.1f)
                reflectiveCurveToRelative(63.0f, -107.5f, 27.5f, -159.2f)
                lineTo(427.3f, 145.3f)
                curveToRelative(-35.5f, -51.7f, -105.3f, -64.3f, -156.0f, -28.1f)
                curveToRelative(-5.6f, 4.0f, -10.7f, 8.4f, -15.3f, 13.1f)
                lineToRelative(0.0f, -18.3f)
                curveTo(256.0f, 50.1f, 205.9f, 0.0f, 144.0f, 0.0f)
                reflectiveCurveTo(32.0f, 50.1f, 32.0f, 112.0f)
                close()
                moveTo(296.6f, 240.2f)
                curveToRelative(-16.0f, -23.3f, -10.0f, -55.3f, 11.9f, -71.0f)
                curveToRelative(21.2f, -15.1f, 50.5f, -10.3f, 66.0f, 12.2f)
                lineToRelative(67.0f, 97.6f)
                lineToRelative(-79.9f, 55.9f)
                lineToRelative(-65.0f, -94.8f)
                close()
            }
        }
        .build()
        return _capsules!!
    }

private var _capsules: ImageVector? = null
