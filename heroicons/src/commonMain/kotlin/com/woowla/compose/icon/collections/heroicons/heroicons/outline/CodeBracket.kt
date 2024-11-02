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

public val OutlineGroup.CodeBracket: ImageVector
    get() {
        if (_codeBracket != null) {
            return _codeBracket!!
        }
        _codeBracket = Builder(name = "CodeBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.25f, 6.75f)
                lineTo(22.5f, 12.0f)
                lineTo(17.25f, 17.25f)
                moveTo(6.75f, 17.25f)
                lineTo(1.5f, 12.0f)
                lineTo(6.75f, 6.75f)
                moveTo(14.25f, 3.75f)
                lineTo(9.75f, 20.25f)
            }
        }
        .build()
        return _codeBracket!!
    }

private var _codeBracket: ImageVector? = null
