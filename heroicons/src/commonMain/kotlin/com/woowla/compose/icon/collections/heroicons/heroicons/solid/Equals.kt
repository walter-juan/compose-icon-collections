package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.Equals: ImageVector
    get() {
        if (_equals != null) {
            return _equals!!
        }
        _equals = Builder(name = "Equals", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.748f, 8.248f)
                curveTo(3.748f, 7.834f, 4.084f, 7.498f, 4.498f, 7.498f)
                horizontalLineTo(19.498f)
                curveTo(19.912f, 7.498f, 20.248f, 7.834f, 20.248f, 8.248f)
                curveTo(20.248f, 8.662f, 19.912f, 8.998f, 19.498f, 8.998f)
                horizontalLineTo(4.498f)
                curveTo(4.084f, 8.998f, 3.748f, 8.662f, 3.748f, 8.248f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.748f, 15.749f)
                curveTo(3.748f, 15.335f, 4.084f, 14.999f, 4.498f, 14.999f)
                horizontalLineTo(19.498f)
                curveTo(19.912f, 14.999f, 20.248f, 15.335f, 20.248f, 15.749f)
                curveTo(20.248f, 16.163f, 19.912f, 16.499f, 19.498f, 16.499f)
                horizontalLineTo(4.498f)
                curveTo(4.084f, 16.499f, 3.748f, 16.163f, 3.748f, 15.749f)
                close()
            }
        }
        .build()
        return _equals!!
    }

private var _equals: ImageVector? = null
