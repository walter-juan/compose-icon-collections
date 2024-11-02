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

public val SolidGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.97f, 3.97f)
                curveTo(13.263f, 3.677f, 13.737f, 3.677f, 14.03f, 3.97f)
                lineTo(21.53f, 11.47f)
                curveTo(21.671f, 11.61f, 21.75f, 11.801f, 21.75f, 12.0f)
                curveTo(21.75f, 12.199f, 21.671f, 12.39f, 21.53f, 12.53f)
                lineTo(14.03f, 20.03f)
                curveTo(13.737f, 20.323f, 13.263f, 20.323f, 12.97f, 20.03f)
                curveTo(12.677f, 19.737f, 12.677f, 19.263f, 12.97f, 18.97f)
                lineTo(19.189f, 12.75f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 12.75f, 2.25f, 12.414f, 2.25f, 12.0f)
                curveTo(2.25f, 11.586f, 2.586f, 11.25f, 3.0f, 11.25f)
                horizontalLineTo(19.189f)
                lineTo(12.97f, 5.03f)
                curveTo(12.677f, 4.737f, 12.677f, 4.263f, 12.97f, 3.97f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
