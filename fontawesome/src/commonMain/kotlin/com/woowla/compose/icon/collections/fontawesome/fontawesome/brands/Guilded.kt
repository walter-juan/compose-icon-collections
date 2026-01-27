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

public val BrandsGroup.Guilded: ImageVector
    get() {
        if (_guilded != null) {
            return _guilded!!
        }
        _guilded = Builder(name = "Guilded", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.9f, 64.0f)
                lineTo(5.0f, 64.0f)
                curveToRelative(0.0f, 103.3f, 22.2f, 180.1f, 43.4f, 222.4f)
                curveToRelative(64.1f, 127.8f, 176.0f, 161.6f, 177.3f, 161.6f)
                curveToRelative(55.7f, -20.5f, 104.5f, -56.3f, 140.6f, -103.5f)
                curveToRelative(25.9f, -33.9f, 53.1f, -87.2f, 65.9f, -145.8f)
                lineToRelative(-259.9f, 0.0f)
                curveToRelative(4.1f, 36.4f, 22.2f, 67.9f, 45.1f, 86.9f)
                lineToRelative(88.6f, 0.0f)
                curveToRelative(-17.0f, 28.2f, -48.2f, 54.4f, -80.5f, 69.5f)
                curveToRelative(-31.2f, -13.3f, -69.1f, -46.5f, -96.5f, -98.4f)
                curveToRelative(-26.7f, -53.8f, -27.1f, -105.9f, -27.1f, -105.9f)
                lineToRelative(336.1f, 0.0f)
                curveToRelative(4.0f, -28.8f, 5.9f, -57.9f, 5.9f, -86.9f)
                close()
            }
        }
        .build()
        return _guilded!!
    }

private var _guilded: ImageVector? = null
