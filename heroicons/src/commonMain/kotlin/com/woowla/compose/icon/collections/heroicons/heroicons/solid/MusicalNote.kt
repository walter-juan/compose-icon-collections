package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.MusicalNote: ImageVector
    get() {
        if (_musicalNote != null) {
            return _musicalNote!!
        }
        _musicalNote = Builder(name = "MusicalNote", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.952f, 1.651f)
                curveTo(20.139f, 1.793f, 20.25f, 2.015f, 20.25f, 2.25f)
                verticalLineTo(5.983f)
                curveTo(20.25f, 5.995f, 20.25f, 6.006f, 20.25f, 6.017f)
                verticalLineTo(16.303f)
                curveTo(20.25f, 17.642f, 19.362f, 18.819f, 18.074f, 19.187f)
                lineTo(16.754f, 19.565f)
                curveTo(15.123f, 20.031f, 13.5f, 18.806f, 13.5f, 17.11f)
                curveTo(13.5f, 15.97f, 14.256f, 14.968f, 15.351f, 14.655f)
                lineTo(17.662f, 13.995f)
                curveTo(18.306f, 13.811f, 18.75f, 13.222f, 18.75f, 12.553f)
                verticalLineTo(6.994f)
                lineTo(9.75f, 9.566f)
                verticalLineTo(19.303f)
                curveTo(9.75f, 20.642f, 8.862f, 21.819f, 7.574f, 22.187f)
                lineTo(6.254f, 22.565f)
                curveTo(4.623f, 23.031f, 3.0f, 21.806f, 3.0f, 20.11f)
                curveTo(3.0f, 18.97f, 3.756f, 17.968f, 4.852f, 17.655f)
                lineTo(7.162f, 16.995f)
                curveTo(7.806f, 16.811f, 8.25f, 16.222f, 8.25f, 15.553f)
                verticalLineTo(9.017f)
                curveTo(8.25f, 9.005f, 8.25f, 8.994f, 8.25f, 8.983f)
                verticalLineTo(5.25f)
                curveTo(8.25f, 4.915f, 8.472f, 4.621f, 8.794f, 4.529f)
                lineTo(19.294f, 1.529f)
                curveTo(19.52f, 1.464f, 19.764f, 1.51f, 19.952f, 1.651f)
                close()
            }
        }
        .build()
        return _musicalNote!!
    }

private var _musicalNote: ImageVector? = null
