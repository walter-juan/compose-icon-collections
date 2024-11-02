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

public val SolidGroup.ArrowSmallUp: ImageVector
    get() {
        if (_arrowSmallUp != null) {
            return _arrowSmallUp!!
        }
        _arrowSmallUp = Builder(name = "ArrowSmallUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 20.25f)
                curveTo(11.586f, 20.25f, 11.25f, 19.914f, 11.25f, 19.5f)
                verticalLineTo(6.311f)
                lineTo(5.78f, 11.78f)
                curveTo(5.487f, 12.073f, 5.013f, 12.073f, 4.72f, 11.78f)
                curveTo(4.427f, 11.487f, 4.427f, 11.013f, 4.72f, 10.72f)
                lineTo(11.47f, 3.97f)
                curveTo(11.763f, 3.677f, 12.237f, 3.677f, 12.53f, 3.97f)
                lineTo(19.28f, 10.72f)
                curveTo(19.573f, 11.013f, 19.573f, 11.487f, 19.28f, 11.78f)
                curveTo(18.987f, 12.073f, 18.513f, 12.073f, 18.22f, 11.78f)
                lineTo(12.75f, 6.311f)
                verticalLineTo(19.5f)
                curveTo(12.75f, 19.914f, 12.414f, 20.25f, 12.0f, 20.25f)
                close()
            }
        }
        .build()
        return _arrowSmallUp!!
    }

private var _arrowSmallUp: ImageVector? = null
