package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Alacritty: ImageVector
    get() {
        if (_alacritty != null) {
            return _alacritty!!
        }
        _alacritty = Builder(name = "Alacritty", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.065f, 0.0f)
                lineToRelative(-8.57f, 21.269f)
                horizontalLineToRelative(3.595f)
                lineToRelative(6.91f, -16.244f)
                lineToRelative(6.91f, 16.244f)
                horizontalLineToRelative(3.594f)
                lineToRelative(-8.57f, -21.269f)
                close()
                moveTo(12.0f, 9.935f)
                curveToRelative(-0.767f, 1.855f, -1.533f, 3.709f, -2.298f, 5.565f)
                curveToRelative(1.475f, 4.54f, 1.475f, 4.54f, 2.298f, 8.5f)
                curveToRelative(0.823f, -3.96f, 0.823f, -3.96f, 2.297f, -8.5f)
                curveToRelative(-0.766f, -1.855f, -1.531f, -3.71f, -2.297f, -5.565f)
                close()
            }
        }
        .build()
        return _alacritty!!
    }

private var _alacritty: ImageVector? = null
