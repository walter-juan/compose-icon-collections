package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ChevronDoubleUp: ImageVector
    get() {
        if (_chevronDoubleUp != null) {
            return _chevronDoubleUp!!
        }
        _chevronDoubleUp = Builder(name = "ChevronDoubleUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 10.72f)
                curveTo(11.763f, 10.427f, 12.237f, 10.427f, 12.53f, 10.72f)
                lineTo(20.03f, 18.22f)
                curveTo(20.323f, 18.513f, 20.323f, 18.987f, 20.03f, 19.28f)
                curveTo(19.737f, 19.573f, 19.263f, 19.573f, 18.97f, 19.28f)
                lineTo(12.0f, 12.311f)
                lineTo(5.03f, 19.28f)
                curveTo(4.737f, 19.573f, 4.263f, 19.573f, 3.97f, 19.28f)
                curveTo(3.677f, 18.987f, 3.677f, 18.513f, 3.97f, 18.22f)
                lineTo(11.47f, 10.72f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 4.72f)
                curveTo(11.763f, 4.427f, 12.237f, 4.427f, 12.53f, 4.72f)
                lineTo(20.03f, 12.22f)
                curveTo(20.323f, 12.513f, 20.323f, 12.987f, 20.03f, 13.28f)
                curveTo(19.737f, 13.573f, 19.263f, 13.573f, 18.97f, 13.28f)
                lineTo(12.0f, 6.311f)
                lineTo(5.03f, 13.28f)
                curveTo(4.737f, 13.573f, 4.263f, 13.573f, 3.97f, 13.28f)
                curveTo(3.677f, 12.987f, 3.677f, 12.513f, 3.97f, 12.22f)
                lineTo(11.47f, 4.72f)
                close()
            }
        }
        .build()
        return _chevronDoubleUp!!
    }

private var _chevronDoubleUp: ImageVector? = null
