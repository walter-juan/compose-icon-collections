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

public val SolidGroup.Divide: ImageVector
    get() {
        if (_divide != null) {
            return _divide!!
        }
        _divide = Builder(name = "Divide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.874f, 5.248f)
                curveTo(10.874f, 4.627f, 11.377f, 4.123f, 11.999f, 4.123f)
                curveTo(12.62f, 4.123f, 13.124f, 4.627f, 13.124f, 5.248f)
                curveTo(13.124f, 5.869f, 12.62f, 6.373f, 11.999f, 6.373f)
                curveTo(11.377f, 6.373f, 10.874f, 5.869f, 10.874f, 5.248f)
                close()
                moveTo(3.749f, 11.998f)
                curveTo(3.749f, 11.584f, 4.084f, 11.248f, 4.499f, 11.248f)
                horizontalLineTo(19.498f)
                curveTo(19.913f, 11.248f, 20.248f, 11.584f, 20.248f, 11.998f)
                curveTo(20.248f, 12.413f, 19.913f, 12.748f, 19.498f, 12.748f)
                horizontalLineTo(4.499f)
                curveTo(4.084f, 12.748f, 3.749f, 12.413f, 3.749f, 11.998f)
                close()
                moveTo(10.874f, 18.751f)
                curveTo(10.874f, 18.13f, 11.378f, 17.626f, 11.999f, 17.626f)
                curveTo(12.621f, 17.626f, 13.124f, 18.13f, 13.124f, 18.751f)
                curveTo(13.124f, 19.372f, 12.621f, 19.876f, 11.999f, 19.876f)
                curveTo(11.378f, 19.876f, 10.874f, 19.372f, 10.874f, 18.751f)
                close()
            }
        }
        .build()
        return _divide!!
    }

private var _divide: ImageVector? = null
