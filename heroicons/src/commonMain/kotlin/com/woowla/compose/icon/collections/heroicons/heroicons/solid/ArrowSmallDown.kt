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

public val SolidGroup.ArrowSmallDown: ImageVector
    get() {
        if (_arrowSmallDown != null) {
            return _arrowSmallDown!!
        }
        _arrowSmallDown = Builder(name = "ArrowSmallDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.75f)
                curveTo(12.414f, 3.75f, 12.75f, 4.086f, 12.75f, 4.5f)
                lineTo(12.75f, 17.689f)
                lineTo(18.22f, 12.22f)
                curveTo(18.513f, 11.927f, 18.987f, 11.927f, 19.28f, 12.22f)
                curveTo(19.573f, 12.513f, 19.573f, 12.987f, 19.28f, 13.28f)
                lineTo(12.53f, 20.03f)
                curveTo(12.237f, 20.323f, 11.763f, 20.323f, 11.47f, 20.03f)
                lineTo(4.72f, 13.28f)
                curveTo(4.427f, 12.987f, 4.427f, 12.513f, 4.72f, 12.22f)
                curveTo(5.013f, 11.927f, 5.487f, 11.927f, 5.78f, 12.22f)
                lineTo(11.25f, 17.689f)
                lineTo(11.25f, 4.5f)
                curveTo(11.25f, 4.086f, 11.586f, 3.75f, 12.0f, 3.75f)
                close()
            }
        }
        .build()
        return _arrowSmallDown!!
    }

private var _arrowSmallDown: ImageVector? = null
