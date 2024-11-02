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

public val SolidGroup.ArrowSmallRight: ImageVector
    get() {
        if (_arrowSmallRight != null) {
            return _arrowSmallRight!!
        }
        _arrowSmallRight = Builder(name = "ArrowSmallRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.75f, 12.0f)
                curveTo(3.75f, 11.586f, 4.086f, 11.25f, 4.5f, 11.25f)
                lineTo(17.689f, 11.25f)
                lineTo(12.22f, 5.78f)
                curveTo(11.927f, 5.487f, 11.927f, 5.013f, 12.22f, 4.72f)
                curveTo(12.513f, 4.427f, 12.987f, 4.427f, 13.28f, 4.72f)
                lineTo(20.03f, 11.47f)
                curveTo(20.323f, 11.763f, 20.323f, 12.237f, 20.03f, 12.53f)
                lineTo(13.28f, 19.28f)
                curveTo(12.987f, 19.573f, 12.513f, 19.573f, 12.22f, 19.28f)
                curveTo(11.927f, 18.987f, 11.927f, 18.513f, 12.22f, 18.22f)
                lineTo(17.689f, 12.75f)
                lineTo(4.5f, 12.75f)
                curveTo(4.086f, 12.75f, 3.75f, 12.414f, 3.75f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowSmallRight!!
    }

private var _arrowSmallRight: ImageVector? = null
