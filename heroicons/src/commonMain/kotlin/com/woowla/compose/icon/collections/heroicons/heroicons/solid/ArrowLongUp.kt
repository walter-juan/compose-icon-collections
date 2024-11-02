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

public val SolidGroup.ArrowLongUp: ImageVector
    get() {
        if (_arrowLongUp != null) {
            return _arrowLongUp!!
        }
        _arrowLongUp = Builder(name = "ArrowLongUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 2.47f)
                curveTo(11.763f, 2.177f, 12.237f, 2.177f, 12.53f, 2.47f)
                lineTo(16.28f, 6.22f)
                curveTo(16.573f, 6.513f, 16.573f, 6.987f, 16.28f, 7.28f)
                curveTo(15.987f, 7.573f, 15.513f, 7.573f, 15.22f, 7.28f)
                lineTo(12.75f, 4.811f)
                verticalLineTo(21.0f)
                curveTo(12.75f, 21.414f, 12.414f, 21.75f, 12.0f, 21.75f)
                curveTo(11.586f, 21.75f, 11.25f, 21.414f, 11.25f, 21.0f)
                verticalLineTo(4.811f)
                lineTo(8.78f, 7.28f)
                curveTo(8.487f, 7.573f, 8.013f, 7.573f, 7.72f, 7.28f)
                curveTo(7.427f, 6.987f, 7.427f, 6.513f, 7.72f, 6.22f)
                lineTo(11.47f, 2.47f)
                close()
            }
        }
        .build()
        return _arrowLongUp!!
    }

private var _arrowLongUp: ImageVector? = null
