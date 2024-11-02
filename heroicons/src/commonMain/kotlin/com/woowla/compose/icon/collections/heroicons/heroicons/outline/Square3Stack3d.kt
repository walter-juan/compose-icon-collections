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

public val OutlineGroup.Square3Stack3d: ImageVector
    get() {
        if (_square3Stack3d != null) {
            return _square3Stack3d!!
        }
        _square3Stack3d = Builder(name = "Square3Stack3d", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.429f, 9.75f)
                lineTo(2.25f, 12.0f)
                lineTo(6.429f, 14.25f)
                moveTo(6.429f, 9.75f)
                lineTo(12.0f, 12.75f)
                lineTo(17.571f, 9.75f)
                moveTo(6.429f, 9.75f)
                lineTo(2.25f, 7.5f)
                lineTo(12.0f, 2.25f)
                lineTo(21.75f, 7.5f)
                lineTo(17.571f, 9.75f)
                moveTo(17.571f, 9.75f)
                lineTo(21.75f, 12.0f)
                lineTo(17.571f, 14.25f)
                moveTo(17.571f, 14.25f)
                lineTo(21.75f, 16.5f)
                lineTo(12.0f, 21.75f)
                lineTo(2.25f, 16.5f)
                lineTo(6.429f, 14.25f)
                moveTo(17.571f, 14.25f)
                lineTo(12.0f, 17.25f)
                lineTo(6.429f, 14.25f)
            }
        }
        .build()
        return _square3Stack3d!!
    }

private var _square3Stack3d: ImageVector? = null
