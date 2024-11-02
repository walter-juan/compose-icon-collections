package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.25f, 4.533f)
                curveTo(9.735f, 3.563f, 7.932f, 3.0f, 6.0f, 3.0f)
                curveTo(4.862f, 3.0f, 3.768f, 3.195f, 2.75f, 3.555f)
                curveTo(2.45f, 3.661f, 2.25f, 3.944f, 2.25f, 4.262f)
                verticalLineTo(18.512f)
                curveTo(2.25f, 18.756f, 2.368f, 18.984f, 2.567f, 19.125f)
                curveTo(2.766f, 19.265f, 3.02f, 19.3f, 3.25f, 19.219f)
                curveTo(4.109f, 18.916f, 5.034f, 18.75f, 6.0f, 18.75f)
                curveTo(7.995f, 18.75f, 9.823f, 19.457f, 11.25f, 20.636f)
                verticalLineTo(4.533f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 20.636f)
                curveTo(14.177f, 19.457f, 16.005f, 18.75f, 18.0f, 18.75f)
                curveTo(18.966f, 18.75f, 19.891f, 18.916f, 20.75f, 19.219f)
                curveTo(20.98f, 19.3f, 21.234f, 19.265f, 21.433f, 19.125f)
                curveTo(21.632f, 18.984f, 21.75f, 18.756f, 21.75f, 18.512f)
                verticalLineTo(4.262f)
                curveTo(21.75f, 3.944f, 21.55f, 3.661f, 21.25f, 3.555f)
                curveTo(20.232f, 3.195f, 19.138f, 3.0f, 18.0f, 3.0f)
                curveTo(16.067f, 3.0f, 14.266f, 3.563f, 12.75f, 4.533f)
                verticalLineTo(20.636f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
