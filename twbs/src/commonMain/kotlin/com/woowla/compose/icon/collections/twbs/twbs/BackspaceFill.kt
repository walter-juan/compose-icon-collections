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

public val Twbs.BackspaceFill: ImageVector
    get() {
        if (_backspaceFill != null) {
            return _backspaceFill!!
        }
        _backspaceFill = Builder(name = "BackspaceFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.683f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-7.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.519f, 0.698f)
                lineTo(0.241f, 7.35f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.302f)
                lineToRelative(4.843f, 5.65f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.603f, 15.0f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
                moveTo(5.829f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, -0.708f)
                lineToRelative(2.147f, 2.147f)
                lineToRelative(2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.707f, 0.708f)
                lineTo(9.39f, 8.0f)
                lineToRelative(2.146f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.708f)
                lineTo(8.683f, 8.707f)
                lineToRelative(-2.147f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.708f)
                lineTo(7.976f, 8.0f)
                close()
            }
        }
        .build()
        return _backspaceFill!!
    }

private var _backspaceFill: ImageVector? = null
