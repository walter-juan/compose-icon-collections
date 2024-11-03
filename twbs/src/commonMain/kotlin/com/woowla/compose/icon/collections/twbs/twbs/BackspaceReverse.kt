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

public val Twbs.BackspaceReverse: ImageVector
    get() {
        if (_backspaceReverse != null) {
            return _backspaceReverse!!
        }
        _backspaceReverse = Builder(name = "BackspaceReverse", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineTo(7.707f, 8.0f)
                lineToRelative(2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.708f)
                lineTo(7.0f, 8.707f)
                lineToRelative(-2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, -0.708f)
                lineTo(6.293f, 8.0f)
                lineTo(4.146f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineTo(7.0f, 7.293f)
                lineToRelative(2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.519f, -0.698f)
                lineToRelative(4.843f, -5.651f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.302f)
                lineTo(10.6f, 1.7f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.08f, 1.0f)
                close()
                moveTo(9.08f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.76f, 0.35f)
                lineTo(14.682f, 8.0f)
                lineToRelative(-4.844f, 5.65f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.759f, 0.35f)
                lineTo(2.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _backspaceReverse!!
    }

private var _backspaceReverse: ImageVector? = null
