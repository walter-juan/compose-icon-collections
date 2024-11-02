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

public val SolidGroup.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = Builder(name = "ChevronLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.72f, 12.53f)
                curveTo(7.427f, 12.237f, 7.427f, 11.763f, 7.72f, 11.47f)
                lineTo(15.22f, 3.97f)
                curveTo(15.513f, 3.677f, 15.987f, 3.677f, 16.28f, 3.97f)
                curveTo(16.573f, 4.263f, 16.573f, 4.737f, 16.28f, 5.03f)
                lineTo(9.311f, 12.0f)
                lineTo(16.28f, 18.97f)
                curveTo(16.573f, 19.263f, 16.573f, 19.737f, 16.28f, 20.03f)
                curveTo(15.987f, 20.323f, 15.513f, 20.323f, 15.22f, 20.03f)
                lineTo(7.72f, 12.53f)
                close()
            }
        }
        .build()
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
