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

public val SolidGroup.ChevronUpDown: ImageVector
    get() {
        if (_chevronUpDown != null) {
            return _chevronUpDown!!
        }
        _chevronUpDown = Builder(name = "ChevronUpDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 4.72f)
                curveTo(11.763f, 4.427f, 12.237f, 4.427f, 12.53f, 4.72f)
                lineTo(16.28f, 8.47f)
                curveTo(16.573f, 8.763f, 16.573f, 9.237f, 16.28f, 9.53f)
                curveTo(15.987f, 9.823f, 15.513f, 9.823f, 15.22f, 9.53f)
                lineTo(12.0f, 6.311f)
                lineTo(8.78f, 9.53f)
                curveTo(8.487f, 9.823f, 8.013f, 9.823f, 7.72f, 9.53f)
                curveTo(7.427f, 9.237f, 7.427f, 8.763f, 7.72f, 8.47f)
                lineTo(11.47f, 4.72f)
                close()
                moveTo(7.72f, 14.47f)
                curveTo(8.013f, 14.177f, 8.487f, 14.177f, 8.78f, 14.47f)
                lineTo(12.0f, 17.689f)
                lineTo(15.22f, 14.47f)
                curveTo(15.513f, 14.177f, 15.987f, 14.177f, 16.28f, 14.47f)
                curveTo(16.573f, 14.763f, 16.573f, 15.237f, 16.28f, 15.53f)
                lineTo(12.53f, 19.28f)
                curveTo(12.237f, 19.573f, 11.763f, 19.573f, 11.47f, 19.28f)
                lineTo(7.72f, 15.53f)
                curveTo(7.427f, 15.237f, 7.427f, 14.763f, 7.72f, 14.47f)
                close()
            }
        }
        .build()
        return _chevronUpDown!!
    }

private var _chevronUpDown: ImageVector? = null
