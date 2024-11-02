package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.288f, 15.038f)
                curveTo(10.338f, 12.988f, 13.662f, 12.988f, 15.712f, 15.038f)
                moveTo(5.106f, 11.856f)
                curveTo(8.913f, 8.048f, 15.087f, 8.048f, 18.894f, 11.856f)
                moveTo(1.924f, 8.674f)
                curveTo(7.489f, 3.109f, 16.511f, 3.109f, 22.076f, 8.674f)
                moveTo(12.53f, 18.22f)
                lineTo(12.0f, 18.75f)
                lineTo(11.47f, 18.22f)
                curveTo(11.762f, 17.927f, 12.237f, 17.927f, 12.53f, 18.22f)
                close()
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
