package com.woowla.compose.icon.collections.ionicons.ionicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.FilledGroup

public val FilledGroup.CaretBackCircle: ImageVector
    get() {
        if (_caretBackCircle != null) {
            return _caretBackCircle!!
        }
        _caretBackCircle = Builder(name = "CaretBackCircle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.87f, 93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.13f, 48.0f, 256.0f)
                close()
                moveTo(300.0f, 181.86f)
                lineTo(300.0f, 330.14f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -26.23f, 12.29f)
                lineTo(184.68f, 268.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -24.6f)
                lineToRelative(89.09f, -74.13f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 300.0f, 181.86f)
                close()
            }
        }
        .build()
        return _caretBackCircle!!
    }

private var _caretBackCircle: ImageVector? = null
