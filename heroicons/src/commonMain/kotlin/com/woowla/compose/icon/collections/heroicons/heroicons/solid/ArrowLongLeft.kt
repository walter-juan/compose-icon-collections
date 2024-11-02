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

public val SolidGroup.ArrowLongLeft: ImageVector
    get() {
        if (_arrowLongLeft != null) {
            return _arrowLongLeft!!
        }
        _arrowLongLeft = Builder(name = "ArrowLongLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.28f, 7.72f)
                curveTo(7.573f, 8.013f, 7.573f, 8.487f, 7.28f, 8.78f)
                lineTo(4.811f, 11.25f)
                horizontalLineTo(21.0f)
                curveTo(21.414f, 11.25f, 21.75f, 11.586f, 21.75f, 12.0f)
                curveTo(21.75f, 12.414f, 21.414f, 12.75f, 21.0f, 12.75f)
                horizontalLineTo(4.811f)
                lineTo(7.28f, 15.22f)
                curveTo(7.573f, 15.513f, 7.573f, 15.987f, 7.28f, 16.28f)
                curveTo(6.987f, 16.573f, 6.513f, 16.573f, 6.22f, 16.28f)
                lineTo(2.47f, 12.53f)
                curveTo(2.177f, 12.237f, 2.177f, 11.763f, 2.47f, 11.47f)
                lineTo(6.22f, 7.72f)
                curveTo(6.513f, 7.427f, 6.987f, 7.427f, 7.28f, 7.72f)
                close()
            }
        }
        .build()
        return _arrowLongLeft!!
    }

private var _arrowLongLeft: ImageVector? = null
