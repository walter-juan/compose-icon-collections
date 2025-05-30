package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.SortDown: ImageVector
    get() {
        if (_sortDown != null) {
            return _sortDown!!
        }
        _sortDown = Builder(name = "SortDown", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.6f, 470.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-128.0f, -128.0f)
                curveToRelative(-9.2f, -9.2f, -11.9f, -22.9f, -6.9f, -34.9f)
                reflectiveCurveToRelative(16.6f, -19.8f, 29.6f, -19.8f)
                lineToRelative(256.0f, 0.0f)
                curveToRelative(12.9f, 0.0f, 24.6f, 7.8f, 29.6f, 19.8f)
                reflectiveCurveToRelative(2.2f, 25.7f, -6.9f, 34.9f)
                lineToRelative(-128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _sortDown!!
    }

private var _sortDown: ImageVector? = null
