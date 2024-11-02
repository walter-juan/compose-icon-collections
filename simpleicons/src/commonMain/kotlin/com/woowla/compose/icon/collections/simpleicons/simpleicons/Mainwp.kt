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

public val Simpleicons.Mainwp: ImageVector
    get() {
        if (_mainwp != null) {
            return _mainwp!!
        }
        _mainwp = Builder(name = "Mainwp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                moveToRelative(0.0f, 2.4f)
                curveToRelative(1.325f, 0.0f, 2.4f, 1.075f, 2.4f, 2.4f)
                arcToRelative(2.397f, 2.397f, 0.0f, false, true, -0.703f, 1.695f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.596f, 0.435f)
                lineTo(16.08f, 19.199f)
                lineTo(12.0f, 21.602f)
                lineToRelative(-4.08f, -2.402f)
                lineToRelative(2.978f, -12.268f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, -0.594f, -0.435f)
                arcToRelative(2.397f, 2.397f, 0.0f, false, true, -0.703f, -1.695f)
                curveToRelative(0.0f, -1.325f, 1.073f, -2.4f, 2.398f, -2.4f)
            }
        }
        .build()
        return _mainwp!!
    }

private var _mainwp: ImageVector? = null
