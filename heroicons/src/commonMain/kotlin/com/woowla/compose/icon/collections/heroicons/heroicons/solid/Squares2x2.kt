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

public val SolidGroup.Squares2x2: ImageVector
    get() {
        if (_squares2x2 != null) {
            return _squares2x2!!
        }
        _squares2x2 = Builder(name = "Squares2x2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.343f, 4.343f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(8.25f)
                curveTo(9.907f, 3.0f, 11.25f, 4.343f, 11.25f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(11.25f, 9.907f, 9.907f, 11.25f, 8.25f, 11.25f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 11.25f, 3.0f, 9.907f, 3.0f, 8.25f)
                verticalLineTo(6.0f)
                close()
                moveTo(12.75f, 6.0f)
                curveTo(12.75f, 4.343f, 14.093f, 3.0f, 15.75f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 3.0f, 21.0f, 4.343f, 21.0f, 6.0f)
                verticalLineTo(8.25f)
                curveTo(21.0f, 9.907f, 19.657f, 11.25f, 18.0f, 11.25f)
                horizontalLineTo(15.75f)
                curveTo(14.093f, 11.25f, 12.75f, 9.907f, 12.75f, 8.25f)
                verticalLineTo(6.0f)
                close()
                moveTo(3.0f, 15.75f)
                curveTo(3.0f, 14.093f, 4.343f, 12.75f, 6.0f, 12.75f)
                horizontalLineTo(8.25f)
                curveTo(9.907f, 12.75f, 11.25f, 14.093f, 11.25f, 15.75f)
                verticalLineTo(18.0f)
                curveTo(11.25f, 19.657f, 9.907f, 21.0f, 8.25f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.343f, 21.0f, 3.0f, 19.657f, 3.0f, 18.0f)
                verticalLineTo(15.75f)
                close()
                moveTo(12.75f, 15.75f)
                curveTo(12.75f, 14.093f, 14.093f, 12.75f, 15.75f, 12.75f)
                horizontalLineTo(18.0f)
                curveTo(19.657f, 12.75f, 21.0f, 14.093f, 21.0f, 15.75f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.657f, 19.657f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(15.75f)
                curveTo(14.093f, 21.0f, 12.75f, 19.657f, 12.75f, 18.0f)
                verticalLineTo(15.75f)
                close()
            }
        }
        .build()
        return _squares2x2!!
    }

private var _squares2x2: ImageVector? = null
