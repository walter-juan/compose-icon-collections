package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Variable: ImageVector
    get() {
        if (_variable != null) {
            return _variable!!
        }
        _variable = Builder(name = "Variable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.745f, 3.0f)
                curveTo(3.62f, 5.779f, 3.0f, 8.817f, 3.0f, 12.0f)
                curveTo(3.0f, 15.183f, 3.62f, 18.221f, 4.745f, 21.0f)
                moveTo(19.5f, 3.0f)
                curveTo(20.467f, 5.779f, 21.0f, 8.817f, 21.0f, 12.0f)
                curveTo(21.0f, 15.183f, 20.467f, 18.221f, 19.5f, 21.0f)
                moveTo(8.25f, 8.885f)
                lineTo(9.694f, 7.996f)
                curveTo(10.106f, 7.742f, 10.646f, 7.939f, 10.799f, 8.397f)
                lineTo(13.201f, 15.603f)
                curveTo(13.354f, 16.061f, 13.894f, 16.258f, 14.306f, 16.004f)
                lineTo(15.75f, 15.115f)
                moveTo(7.5f, 15.865f)
                lineTo(7.713f, 15.956f)
                curveTo(8.46f, 16.271f, 9.325f, 16.012f, 9.775f, 15.338f)
                lineTo(14.225f, 8.662f)
                curveTo(14.675f, 7.988f, 15.54f, 7.729f, 16.287f, 8.044f)
                lineTo(16.5f, 8.135f)
            }
        }
        .build()
        return _variable!!
    }

private var _variable: ImageVector? = null
