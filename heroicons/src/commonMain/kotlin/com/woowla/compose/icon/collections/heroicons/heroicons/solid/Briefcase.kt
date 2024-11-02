package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.5f, 5.25f)
                curveTo(7.5f, 3.593f, 8.843f, 2.25f, 10.5f, 2.25f)
                horizontalLineTo(13.5f)
                curveTo(15.157f, 2.25f, 16.5f, 3.593f, 16.5f, 5.25f)
                verticalLineTo(5.455f)
                curveTo(17.433f, 5.54f, 18.357f, 5.652f, 19.274f, 5.789f)
                curveTo(20.728f, 6.007f, 21.75f, 7.272f, 21.75f, 8.706f)
                verticalLineTo(11.739f)
                curveTo(21.75f, 12.95f, 21.016f, 14.091f, 19.814f, 14.491f)
                curveTo(17.357f, 15.308f, 14.729f, 15.75f, 12.0f, 15.75f)
                curveTo(9.271f, 15.75f, 6.643f, 15.308f, 4.186f, 14.491f)
                curveTo(2.984f, 14.091f, 2.25f, 12.95f, 2.25f, 11.739f)
                verticalLineTo(8.706f)
                curveTo(2.25f, 7.272f, 3.272f, 6.007f, 4.726f, 5.789f)
                curveTo(5.643f, 5.652f, 6.568f, 5.54f, 7.5f, 5.455f)
                verticalLineTo(5.25f)
                close()
                moveTo(15.0f, 5.25f)
                verticalLineTo(5.341f)
                curveTo(14.008f, 5.281f, 13.007f, 5.25f, 12.0f, 5.25f)
                curveTo(10.993f, 5.25f, 9.992f, 5.281f, 9.0f, 5.341f)
                verticalLineTo(5.25f)
                curveTo(9.0f, 4.422f, 9.672f, 3.75f, 10.5f, 3.75f)
                horizontalLineTo(13.5f)
                curveTo(14.328f, 3.75f, 15.0f, 4.422f, 15.0f, 5.25f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(12.414f, 13.5f, 12.75f, 13.164f, 12.75f, 12.75f)
                curveTo(12.75f, 12.336f, 12.414f, 12.0f, 12.0f, 12.0f)
                curveTo(11.586f, 12.0f, 11.25f, 12.336f, 11.25f, 12.75f)
                curveTo(11.25f, 13.164f, 11.586f, 13.5f, 12.0f, 13.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.4f)
                verticalLineTo(15.604f)
                curveTo(3.223f, 15.726f, 3.461f, 15.831f, 3.713f, 15.915f)
                curveTo(6.321f, 16.781f, 9.108f, 17.25f, 12.0f, 17.25f)
                curveTo(14.892f, 17.25f, 17.679f, 16.781f, 20.287f, 15.915f)
                curveTo(20.539f, 15.831f, 20.777f, 15.726f, 21.0f, 15.604f)
                verticalLineTo(18.4f)
                curveTo(21.0f, 19.852f, 19.953f, 21.128f, 18.477f, 21.323f)
                curveTo(16.358f, 21.605f, 14.196f, 21.75f, 12.0f, 21.75f)
                curveTo(9.804f, 21.75f, 7.642f, 21.605f, 5.523f, 21.323f)
                curveTo(4.047f, 21.128f, 3.0f, 19.852f, 3.0f, 18.4f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
