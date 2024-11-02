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

public val SolidGroup.Stop: ImageVector
    get() {
        if (_stop != null) {
            return _stop!!
        }
        _stop = Builder(name = "Stop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.5f, 7.5f)
                curveTo(4.5f, 5.843f, 5.843f, 4.5f, 7.5f, 4.5f)
                horizontalLineTo(16.5f)
                curveTo(18.157f, 4.5f, 19.5f, 5.843f, 19.5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(19.5f, 18.157f, 18.157f, 19.5f, 16.5f, 19.5f)
                horizontalLineTo(7.5f)
                curveTo(5.843f, 19.5f, 4.5f, 18.157f, 4.5f, 16.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _stop!!
    }

private var _stop: ImageVector? = null
