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

public val OutlineGroup.MagnifyingGlassMinus: ImageVector
    get() {
        if (_magnifyingGlassMinus != null) {
            return _magnifyingGlassMinus!!
        }
        _magnifyingGlassMinus = Builder(name = "MagnifyingGlassMinus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                lineTo(15.803f, 15.803f)
                moveTo(15.803f, 15.803f)
                curveTo(17.16f, 14.446f, 18.0f, 12.571f, 18.0f, 10.5f)
                curveTo(18.0f, 6.358f, 14.642f, 3.0f, 10.5f, 3.0f)
                curveTo(6.358f, 3.0f, 3.0f, 6.358f, 3.0f, 10.5f)
                curveTo(3.0f, 14.642f, 6.358f, 18.0f, 10.5f, 18.0f)
                curveTo(12.571f, 18.0f, 14.446f, 17.16f, 15.803f, 15.803f)
                close()
                moveTo(13.5f, 10.5f)
                horizontalLineTo(7.5f)
            }
        }
        .build()
        return _magnifyingGlassMinus!!
    }

private var _magnifyingGlassMinus: ImageVector? = null
