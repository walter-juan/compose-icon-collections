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

public val OutlineGroup.CodeBracketSquare: ImageVector
    get() {
        if (_codeBracketSquare != null) {
            return _codeBracketSquare!!
        }
        _codeBracketSquare = Builder(name = "CodeBracketSquare", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.25f, 9.75f)
                lineTo(16.5f, 12.0f)
                lineTo(14.25f, 14.25f)
                moveTo(9.75f, 14.25f)
                lineTo(7.5f, 12.0f)
                lineTo(9.75f, 9.75f)
                moveTo(6.0f, 20.25f)
                horizontalLineTo(18.0f)
                curveTo(19.243f, 20.25f, 20.25f, 19.243f, 20.25f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(20.25f, 4.757f, 19.243f, 3.75f, 18.0f, 3.75f)
                horizontalLineTo(6.0f)
                curveTo(4.757f, 3.75f, 3.75f, 4.757f, 3.75f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(3.75f, 19.243f, 4.757f, 20.25f, 6.0f, 20.25f)
                close()
            }
        }
        .build()
        return _codeBracketSquare!!
    }

private var _codeBracketSquare: ImageVector? = null
