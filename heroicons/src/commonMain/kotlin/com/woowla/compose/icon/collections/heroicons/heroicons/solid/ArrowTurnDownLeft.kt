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

public val SolidGroup.ArrowTurnDownLeft: ImageVector
    get() {
        if (_arrowTurnDownLeft != null) {
            return _arrowTurnDownLeft!!
        }
        _arrowTurnDownLeft = Builder(name = "ArrowTurnDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.239f, 3.749f)
                curveTo(19.824f, 3.749f, 19.489f, 4.085f, 19.489f, 4.499f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.55f)
                lineTo(8.019f, 12.53f)
                curveTo(8.312f, 12.237f, 8.312f, 11.762f, 8.019f, 11.469f)
                curveTo(7.727f, 11.176f, 7.252f, 11.176f, 6.959f, 11.469f)
                lineTo(3.209f, 15.22f)
                curveTo(2.916f, 15.513f, 2.916f, 15.988f, 3.209f, 16.28f)
                lineTo(6.959f, 20.031f)
                curveTo(7.252f, 20.324f, 7.727f, 20.324f, 8.019f, 20.031f)
                curveTo(8.312f, 19.738f, 8.312f, 19.263f, 8.019f, 18.97f)
                lineTo(5.55f, 16.5f)
                horizontalLineTo(20.239f)
                curveTo(20.653f, 16.5f, 20.989f, 16.164f, 20.989f, 15.75f)
                verticalLineTo(4.499f)
                curveTo(20.989f, 4.085f, 20.653f, 3.749f, 20.239f, 3.749f)
                close()
            }
        }
        .build()
        return _arrowTurnDownLeft!!
    }

private var _arrowTurnDownLeft: ImageVector? = null
