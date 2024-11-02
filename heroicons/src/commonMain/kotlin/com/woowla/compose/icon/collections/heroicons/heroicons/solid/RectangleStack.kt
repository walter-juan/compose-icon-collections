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

public val SolidGroup.RectangleStack: ImageVector
    get() {
        if (_rectangleStack != null) {
            return _rectangleStack!!
        }
        _rectangleStack = Builder(name = "RectangleStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.566f, 4.657f)
                curveTo(5.944f, 4.555f, 6.34f, 4.5f, 6.75f, 4.5f)
                horizontalLineTo(17.25f)
                curveTo(17.659f, 4.5f, 18.056f, 4.555f, 18.433f, 4.657f)
                curveTo(17.941f, 3.675f, 16.924f, 3.0f, 15.75f, 3.0f)
                horizontalLineTo(8.25f)
                curveTo(7.076f, 3.0f, 6.059f, 3.675f, 5.566f, 4.657f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.25f, 12.0f)
                curveTo(2.25f, 10.343f, 3.593f, 9.0f, 5.25f, 9.0f)
                horizontalLineTo(18.75f)
                curveTo(20.407f, 9.0f, 21.75f, 10.343f, 21.75f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(21.75f, 19.657f, 20.407f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(3.593f, 21.0f, 2.25f, 19.657f, 2.25f, 18.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 7.5f)
                curveTo(4.84f, 7.5f, 4.444f, 7.555f, 4.066f, 7.657f)
                curveTo(4.559f, 6.675f, 5.576f, 6.0f, 6.75f, 6.0f)
                horizontalLineTo(17.25f)
                curveTo(18.424f, 6.0f, 19.441f, 6.675f, 19.933f, 7.657f)
                curveTo(19.556f, 7.555f, 19.159f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _rectangleStack!!
    }

private var _rectangleStack: ImageVector? = null
