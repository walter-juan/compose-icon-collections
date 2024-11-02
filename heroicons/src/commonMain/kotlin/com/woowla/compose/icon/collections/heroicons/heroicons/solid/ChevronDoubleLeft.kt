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

public val SolidGroup.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.72f, 11.47f)
                curveTo(10.427f, 11.763f, 10.427f, 12.237f, 10.72f, 12.53f)
                lineTo(18.22f, 20.03f)
                curveTo(18.513f, 20.323f, 18.987f, 20.323f, 19.28f, 20.03f)
                curveTo(19.573f, 19.737f, 19.573f, 19.263f, 19.28f, 18.97f)
                lineTo(12.311f, 12.0f)
                lineTo(19.28f, 5.03f)
                curveTo(19.573f, 4.737f, 19.573f, 4.263f, 19.28f, 3.97f)
                curveTo(18.987f, 3.677f, 18.513f, 3.677f, 18.22f, 3.97f)
                lineTo(10.72f, 11.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.72f, 11.47f)
                curveTo(4.427f, 11.763f, 4.427f, 12.237f, 4.72f, 12.53f)
                lineTo(12.22f, 20.03f)
                curveTo(12.513f, 20.323f, 12.987f, 20.323f, 13.28f, 20.03f)
                curveTo(13.573f, 19.737f, 13.573f, 19.263f, 13.28f, 18.97f)
                lineTo(6.311f, 12.0f)
                lineTo(13.28f, 5.03f)
                curveTo(13.573f, 4.737f, 13.573f, 4.263f, 13.28f, 3.97f)
                curveTo(12.987f, 3.677f, 12.513f, 3.677f, 12.22f, 3.97f)
                lineTo(4.72f, 11.47f)
                close()
            }
        }
        .build()
        return _chevronDoubleLeft!!
    }

private var _chevronDoubleLeft: ImageVector? = null
