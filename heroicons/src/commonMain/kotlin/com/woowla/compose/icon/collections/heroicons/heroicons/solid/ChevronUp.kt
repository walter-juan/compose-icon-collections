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

public val SolidGroup.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 7.72f)
                curveTo(11.763f, 7.427f, 12.237f, 7.427f, 12.53f, 7.72f)
                lineTo(20.03f, 15.22f)
                curveTo(20.323f, 15.513f, 20.323f, 15.987f, 20.03f, 16.28f)
                curveTo(19.737f, 16.573f, 19.263f, 16.573f, 18.97f, 16.28f)
                lineTo(12.0f, 9.311f)
                lineTo(5.03f, 16.28f)
                curveTo(4.737f, 16.573f, 4.263f, 16.573f, 3.97f, 16.28f)
                curveTo(3.677f, 15.987f, 3.677f, 15.513f, 3.97f, 15.22f)
                lineTo(11.47f, 7.72f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
