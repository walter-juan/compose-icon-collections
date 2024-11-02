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

public val SolidGroup.ArrowTurnDownRight: ImageVector
    get() {
        if (_arrowTurnDownRight != null) {
            return _arrowTurnDownRight!!
        }
        _arrowTurnDownRight = Builder(name = "ArrowTurnDownRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.739f, 3.749f)
                curveTo(4.153f, 3.749f, 4.489f, 4.085f, 4.489f, 4.499f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.428f)
                lineTo(15.958f, 12.53f)
                curveTo(15.666f, 12.237f, 15.666f, 11.762f, 15.959f, 11.469f)
                curveTo(16.251f, 11.176f, 16.726f, 11.176f, 17.019f, 11.469f)
                lineTo(20.769f, 15.22f)
                curveTo(21.062f, 15.513f, 21.062f, 15.988f, 20.769f, 16.28f)
                lineTo(17.019f, 20.031f)
                curveTo(16.726f, 20.324f, 16.251f, 20.324f, 15.959f, 20.031f)
                curveTo(15.666f, 19.738f, 15.666f, 19.263f, 15.958f, 18.97f)
                lineTo(18.428f, 16.5f)
                horizontalLineTo(3.739f)
                curveTo(3.325f, 16.5f, 2.989f, 16.164f, 2.989f, 15.75f)
                verticalLineTo(4.499f)
                curveTo(2.989f, 4.085f, 3.325f, 3.749f, 3.739f, 3.749f)
                close()
            }
        }
        .build()
        return _arrowTurnDownRight!!
    }

private var _arrowTurnDownRight: ImageVector? = null
