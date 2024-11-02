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

public val SolidGroup.ArrowLeft: ImageVector
    get() {
        if (_arrowLeft != null) {
            return _arrowLeft!!
        }
        _arrowLeft = Builder(name = "ArrowLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.03f, 3.97f)
                curveTo(11.323f, 4.263f, 11.323f, 4.737f, 11.03f, 5.03f)
                lineTo(4.811f, 11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.414f, 11.25f, 21.75f, 11.586f, 21.75f, 12.0f)
                curveTo(21.75f, 12.414f, 21.414f, 12.75f, 21.0f, 12.75f)
                horizontalLineTo(4.811f)
                lineTo(11.03f, 18.97f)
                curveTo(11.323f, 19.263f, 11.323f, 19.737f, 11.03f, 20.03f)
                curveTo(10.737f, 20.323f, 10.263f, 20.323f, 9.97f, 20.03f)
                lineTo(2.47f, 12.53f)
                curveTo(2.177f, 12.237f, 2.177f, 11.763f, 2.47f, 11.47f)
                lineTo(9.97f, 3.97f)
                curveTo(10.263f, 3.677f, 10.737f, 3.677f, 11.03f, 3.97f)
                close()
            }
        }
        .build()
        return _arrowLeft!!
    }

private var _arrowLeft: ImageVector? = null
