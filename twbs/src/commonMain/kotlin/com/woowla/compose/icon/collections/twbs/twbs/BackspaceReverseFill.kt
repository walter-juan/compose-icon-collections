package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BackspaceReverseFill: ImageVector
    get() {
        if (_backspaceReverseFill != null) {
            return _backspaceReverseFill!!
        }
        _backspaceReverseFill = Builder(name = "BackspaceReverseFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.519f, 0.698f)
                lineToRelative(4.843f, 5.651f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.302f)
                lineTo(10.6f, 14.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.52f, 0.7f)
                lineTo(2.0f, 15.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(9.854f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.708f, -0.708f)
                lineTo(7.0f, 7.293f)
                lineTo(4.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, -0.708f, 0.708f)
                lineTo(6.293f, 8.0f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.708f)
                lineTo(7.0f, 8.707f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, -0.708f)
                lineTo(7.707f, 8.0f)
                close()
            }
        }
        .build()
        return _backspaceReverseFill!!
    }

private var _backspaceReverseFill: ImageVector? = null
