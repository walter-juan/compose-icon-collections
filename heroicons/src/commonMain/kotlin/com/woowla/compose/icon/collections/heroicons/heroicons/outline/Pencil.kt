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

public val OutlineGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.862f, 4.487f)
                lineTo(18.549f, 2.799f)
                curveTo(19.281f, 2.067f, 20.469f, 2.067f, 21.201f, 2.799f)
                curveTo(21.933f, 3.531f, 21.933f, 4.719f, 21.201f, 5.451f)
                lineTo(6.832f, 19.819f)
                curveTo(6.304f, 20.348f, 5.651f, 20.737f, 4.935f, 20.95f)
                lineTo(2.25f, 21.75f)
                lineTo(3.05f, 19.065f)
                curveTo(3.263f, 18.349f, 3.652f, 17.697f, 4.181f, 17.168f)
                lineTo(16.862f, 4.487f)
                close()
                moveTo(16.862f, 4.487f)
                lineTo(19.5f, 7.125f)
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
