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

public val SolidGroup.WandMagic: ImageVector
    get() {
        if (_wandMagic != null) {
            return _wandMagic!!
        }
        _wandMagic = Builder(name = "WandMagic", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(398.5f, 12.2f)
                lineToRelative(-88.2f, 88.2f)
                lineToRelative(101.3f, 101.3f)
                lineToRelative(88.2f, -88.2f)
                curveTo(507.6f, 105.6f, 512.0f, 95.0f, 512.0f, 84.0f)
                reflectiveCurveToRelative(-4.4f, -21.6f, -12.2f, -29.5f)
                lineTo(457.5f, 12.2f)
                curveTo(449.6f, 4.4f, 439.0f, 0.0f, 428.0f, 0.0f)
                reflectiveCurveToRelative(-21.6f, 4.4f, -29.5f, 12.2f)
                close()
                moveTo(276.4f, 134.3f)
                lineTo(12.2f, 398.5f)
                curveTo(4.4f, 406.4f, 0.0f, 417.0f, 0.0f, 428.0f)
                reflectiveCurveToRelative(4.4f, 21.6f, 12.2f, 29.5f)
                lineToRelative(42.3f, 42.3f)
                curveTo(62.4f, 507.6f, 73.0f, 512.0f, 84.0f, 512.0f)
                reflectiveCurveToRelative(21.6f, -4.4f, 29.5f, -12.2f)
                lineTo(377.7f, 235.6f)
                lineTo(276.4f, 134.3f)
                close()
            }
        }
        .build()
        return _wandMagic!!
    }

private var _wandMagic: ImageVector? = null
