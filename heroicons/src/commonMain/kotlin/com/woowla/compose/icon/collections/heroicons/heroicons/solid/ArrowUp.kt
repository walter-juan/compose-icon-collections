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

public val SolidGroup.ArrowUp: ImageVector
    get() {
        if (_arrowUp != null) {
            return _arrowUp!!
        }
        _arrowUp = Builder(name = "ArrowUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 2.47f)
                curveTo(11.763f, 2.177f, 12.237f, 2.177f, 12.53f, 2.47f)
                lineTo(20.03f, 9.97f)
                curveTo(20.323f, 10.263f, 20.323f, 10.737f, 20.03f, 11.03f)
                curveTo(19.737f, 11.323f, 19.263f, 11.323f, 18.97f, 11.03f)
                lineTo(12.75f, 4.811f)
                verticalLineTo(21.0f)
                curveTo(12.75f, 21.414f, 12.414f, 21.75f, 12.0f, 21.75f)
                curveTo(11.586f, 21.75f, 11.25f, 21.414f, 11.25f, 21.0f)
                verticalLineTo(4.811f)
                lineTo(5.03f, 11.03f)
                curveTo(4.737f, 11.323f, 4.263f, 11.323f, 3.97f, 11.03f)
                curveTo(3.677f, 10.737f, 3.677f, 10.263f, 3.97f, 9.97f)
                lineTo(11.47f, 2.47f)
                close()
            }
        }
        .build()
        return _arrowUp!!
    }

private var _arrowUp: ImageVector? = null
