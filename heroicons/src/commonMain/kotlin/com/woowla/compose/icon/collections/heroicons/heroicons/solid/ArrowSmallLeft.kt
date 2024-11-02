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

public val SolidGroup.ArrowSmallLeft: ImageVector
    get() {
        if (_arrowSmallLeft != null) {
            return _arrowSmallLeft!!
        }
        _arrowSmallLeft = Builder(name = "ArrowSmallLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.25f, 12.0f)
                curveTo(20.25f, 12.414f, 19.914f, 12.75f, 19.5f, 12.75f)
                lineTo(6.311f, 12.75f)
                lineTo(11.78f, 18.22f)
                curveTo(12.073f, 18.513f, 12.073f, 18.987f, 11.78f, 19.28f)
                curveTo(11.487f, 19.573f, 11.013f, 19.573f, 10.72f, 19.28f)
                lineTo(3.97f, 12.53f)
                curveTo(3.677f, 12.237f, 3.677f, 11.763f, 3.97f, 11.47f)
                lineTo(10.72f, 4.72f)
                curveTo(11.013f, 4.427f, 11.487f, 4.427f, 11.78f, 4.72f)
                curveTo(12.073f, 5.013f, 12.073f, 5.487f, 11.78f, 5.78f)
                lineTo(6.311f, 11.25f)
                lineTo(19.5f, 11.25f)
                curveTo(19.914f, 11.25f, 20.25f, 11.586f, 20.25f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowSmallLeft!!
    }

private var _arrowSmallLeft: ImageVector? = null
