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

public val Twbs.Folder2Open: ImageVector
    get() {
        if (_folder2Open != null) {
            return _folder2Open!!
        }
        _folder2Open = Builder(name = "Folder2Open", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.5f, 2.0f)
                horizontalLineToRelative(2.764f)
                curveToRelative(0.958f, 0.0f, 1.76f, 0.56f, 2.311f, 1.184f)
                curveTo(7.985f, 3.648f, 8.48f, 4.0f, 9.0f, 4.0f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 5.5f)
                verticalLineToRelative(0.64f)
                curveToRelative(0.57f, 0.265f, 0.94f, 0.876f, 0.856f, 1.546f)
                lineToRelative(-0.64f, 5.124f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 12.733f, 15.0f)
                lineTo(3.266f, 15.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.481f, -2.19f)
                lineToRelative(-0.64f, -5.124f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.0f, 6.14f)
                close()
                moveTo(2.0f, 6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                lineTo(9.0f, 5.0f)
                curveToRelative(-0.964f, 0.0f, -1.71f, -0.629f, -2.174f, -1.154f)
                curveTo(6.374f, 3.334f, 5.82f, 3.0f, 5.264f, 3.0f)
                lineTo(2.5f, 3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                close()
                moveTo(1.633f, 7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.496f, 0.562f)
                lineToRelative(0.64f, 5.124f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.266f, 14.0f)
                horizontalLineToRelative(9.468f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.489f, -1.314f)
                lineToRelative(0.64f, -5.124f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.367f, 7.0f)
                close()
            }
        }
        .build()
        return _folder2Open!!
    }

private var _folder2Open: ImageVector? = null
