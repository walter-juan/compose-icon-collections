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

public val BrandsGroup.Kaggle: ImageVector
    get() {
        if (_kaggle != null) {
            return _kaggle!!
        }
        _kaggle = Builder(name = "Kaggle", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.2f, 501.5f)
                lineTo(158.4f, 320.3f)
                lineTo(298.2f, 185.0f)
                curveToRelative(2.6f, -2.7f, 1.7f, -10.5f, -5.3f, -10.5f)
                lineToRelative(-69.2f, 0.0f)
                curveToRelative(-3.5f, 0.0f, -7.0f, 1.8f, -10.5f, 5.3f)
                lineToRelative(-132.3f, 133.7f)
                lineToRelative(0.0f, -306.0f)
                curveToRelative(0.0f, -5.0f, -2.5f, -7.5f, -7.5f, -7.5f)
                lineTo(21.5f, 0.0f)
                curveTo(16.5f, 0.0f, 14.0f, 2.5f, 14.0f, 7.5f)
                lineToRelative(0.0f, 497.0f)
                curveToRelative(0.0f, 5.0f, 2.5f, 7.5f, 7.5f, 7.5f)
                lineToRelative(51.9f, 0.0f)
                curveToRelative(5.0f, 0.0f, 7.5f, -2.5f, 7.5f, -7.5f)
                lineToRelative(0.0f, -109.0f)
                lineToRelative(30.8f, -29.3f)
                lineToRelative(110.5f, 140.6f)
                curveToRelative(3.0f, 3.5f, 6.5f, 5.3f, 10.5f, 5.3f)
                lineToRelative(66.9f, 0.0f)
                curveToRelative(3.5f, 0.0f, 5.5f, -1.0f, 6.0f, -3.0f)
                lineToRelative(-1.4f, -7.6f)
                close()
            }
        }
        .build()
        return _kaggle!!
    }

private var _kaggle: ImageVector? = null
