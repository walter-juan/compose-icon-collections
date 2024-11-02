package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.CaretDownCircle: ImageVector
    get() {
        if (_caretDownCircle != null) {
            return _caretDownCircle!!
        }
        _caretDownCircle = Builder(name = "CaretDownCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 256.0f)
                curveToRelative(0.0f, -114.87f, -93.13f, -208.0f, -208.0f, -208.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveTo(464.0f, 370.87f, 464.0f, 256.0f)
                close()
                moveTo(364.27f, 212.0f)
                lineTo(256.0f, 342.09f)
                lineTo(147.73f, 212.0f)
                close()
            }
        }
        .build()
        return _caretDownCircle!!
    }

private var _caretDownCircle: ImageVector? = null
