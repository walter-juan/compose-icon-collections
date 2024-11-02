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

public val OutlineGroup.MagnifyingGlassCircle: ImageVector
    get() {
        if (_magnifyingGlassCircle != null) {
            return _magnifyingGlassCircle!!
        }
        _magnifyingGlassCircle = Builder(name = "MagnifyingGlassCircle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.75f, 15.75f)
                lineTo(13.262f, 13.262f)
                moveTo(13.262f, 13.262f)
                curveTo(13.872f, 12.651f, 14.25f, 11.807f, 14.25f, 10.875f)
                curveTo(14.25f, 9.011f, 12.739f, 7.5f, 10.875f, 7.5f)
                curveTo(9.011f, 7.5f, 7.5f, 9.011f, 7.5f, 10.875f)
                curveTo(7.5f, 12.739f, 9.011f, 14.25f, 10.875f, 14.25f)
                curveTo(11.807f, 14.25f, 12.651f, 13.872f, 13.262f, 13.262f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _magnifyingGlassCircle!!
    }

private var _magnifyingGlassCircle: ImageVector? = null
