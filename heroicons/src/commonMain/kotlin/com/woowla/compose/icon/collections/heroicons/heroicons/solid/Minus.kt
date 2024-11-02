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

public val SolidGroup.Minus: ImageVector
    get() {
        if (_minus != null) {
            return _minus!!
        }
        _minus = Builder(name = "Minus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.25f, 12.0f)
                curveTo(4.25f, 11.586f, 4.586f, 11.25f, 5.0f, 11.25f)
                horizontalLineTo(19.0f)
                curveTo(19.414f, 11.25f, 19.75f, 11.586f, 19.75f, 12.0f)
                curveTo(19.75f, 12.414f, 19.414f, 12.75f, 19.0f, 12.75f)
                horizontalLineTo(5.0f)
                curveTo(4.586f, 12.75f, 4.25f, 12.414f, 4.25f, 12.0f)
                close()
            }
        }
        .build()
        return _minus!!
    }

private var _minus: ImageVector? = null
