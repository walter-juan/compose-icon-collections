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

public val OutlineGroup.MusicalNote: ImageVector
    get() {
        if (_musicalNote != null) {
            return _musicalNote!!
        }
        _musicalNote = Builder(name = "MusicalNote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                lineTo(19.5f, 6.0f)
                moveTo(19.5f, 12.553f)
                verticalLineTo(16.303f)
                curveTo(19.5f, 17.307f, 18.834f, 18.19f, 17.868f, 18.466f)
                lineTo(16.548f, 18.843f)
                curveTo(15.396f, 19.172f, 14.25f, 18.308f, 14.25f, 17.11f)
                curveTo(14.25f, 16.305f, 14.784f, 15.597f, 15.558f, 15.376f)
                lineTo(17.868f, 14.716f)
                curveTo(18.834f, 14.44f, 19.5f, 13.557f, 19.5f, 12.553f)
                close()
                moveTo(19.5f, 12.553f)
                verticalLineTo(2.25f)
                lineTo(9.0f, 5.25f)
                verticalLineTo(15.553f)
                moveTo(9.0f, 15.553f)
                verticalLineTo(19.303f)
                curveTo(9.0f, 20.307f, 8.334f, 21.19f, 7.368f, 21.466f)
                lineTo(6.048f, 21.843f)
                curveTo(4.896f, 22.172f, 3.75f, 21.308f, 3.75f, 20.11f)
                curveTo(3.75f, 19.305f, 4.284f, 18.597f, 5.058f, 18.376f)
                lineTo(7.368f, 17.716f)
                curveTo(8.334f, 17.44f, 9.0f, 16.557f, 9.0f, 15.553f)
                close()
            }
        }
        .build()
        return _musicalNote!!
    }

private var _musicalNote: ImageVector? = null
