package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.BookmarkSlashFill16: ImageVector
    get() {
        if (_bookmarkSlashFill16 != null) {
            return _bookmarkSlashFill16!!
        }
        _bookmarkSlashFill16 = Builder(name = "BookmarkSlashFill16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.19f, 1.143f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.88f, 1.215f)
                lineTo(3.0f, 4.305f)
                verticalLineToRelative(9.945f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.206f, 0.596f)
                lineTo(8.0f, 11.944f)
                lineToRelative(3.794f, 2.902f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 13.0f, 14.25f)
                verticalLineToRelative(-2.703f)
                lineToRelative(1.81f, 1.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.88f, -1.214f)
                lineToRelative(-2.994f, -2.168f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, false, -0.014f, -0.01f)
                lineTo(4.196f, 3.32f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, false, -0.014f, -0.01f)
                lineTo(1.19f, 1.143f)
                close()
                moveTo(4.124f, 1.346f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 4.6f, 1.0f)
                horizontalLineToRelative(7.233f)
                curveTo(12.478f, 1.0f, 13.0f, 1.522f, 13.0f, 2.167f)
                verticalLineToRelative(5.05f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.793f, 0.405f)
                lineToRelative(-7.9f, -5.717f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.183f, -0.559f)
                close()
            }
        }
        .build()
        return _bookmarkSlashFill16!!
    }

private var _bookmarkSlashFill16: ImageVector? = null
