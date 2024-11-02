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

public val SolidGroup.Bars2: ImageVector
    get() {
        if (_bars2 != null) {
            return _bars2!!
        }
        _bars2 = Builder(name = "Bars2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 9.0f)
                curveTo(3.0f, 8.586f, 3.336f, 8.25f, 3.75f, 8.25f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 8.25f, 21.0f, 8.586f, 21.0f, 9.0f)
                curveTo(21.0f, 9.414f, 20.664f, 9.75f, 20.25f, 9.75f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 9.75f, 3.0f, 9.414f, 3.0f, 9.0f)
                close()
                moveTo(3.0f, 15.75f)
                curveTo(3.0f, 15.336f, 3.336f, 15.0f, 3.75f, 15.0f)
                horizontalLineTo(20.25f)
                curveTo(20.664f, 15.0f, 21.0f, 15.336f, 21.0f, 15.75f)
                curveTo(21.0f, 16.164f, 20.664f, 16.5f, 20.25f, 16.5f)
                horizontalLineTo(3.75f)
                curveTo(3.336f, 16.5f, 3.0f, 16.164f, 3.0f, 15.75f)
                close()
            }
        }
        .build()
        return _bars2!!
    }

private var _bars2: ImageVector? = null
