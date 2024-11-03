package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.83f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.708f)
                lineTo(7.975f, 8.0f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.708f)
                lineToRelative(2.147f, -2.147f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, -0.708f)
                lineTo(9.39f, 8.0f)
                lineToRelative(2.146f, -2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, -0.708f)
                lineTo(8.683f, 7.293f)
                lineTo(6.536f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.683f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.519f, -0.698f)
                lineTo(0.241f, 8.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.302f)
                lineTo(5.084f, 1.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.603f, 1.0f)
                close()
                moveTo(6.603f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.76f, 0.35f)
                lineTo(1.0f, 8.0f)
                lineToRelative(4.844f, 5.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.759f, 0.35f)
                horizontalLineToRelative(7.08f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(14.683f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
