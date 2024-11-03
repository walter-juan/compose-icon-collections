package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.BookmarkStarFill: ImageVector
    get() {
        if (_bookmarkStarFill != null) {
            return _bookmarkStarFill!!
        }
        _bookmarkStarFill = Builder(name = "BookmarkStarFill", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 15.5f)
                verticalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.74f, 0.439f)
                lineTo(8.0f, 13.069f)
                lineToRelative(-5.26f, 2.87f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 15.5f)
                moveTo(8.16f, 4.1f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, false, -0.32f, 0.0f)
                lineToRelative(-0.634f, 1.285f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, -0.134f, 0.098f)
                lineToRelative(-1.42f, 0.206f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, false, -0.098f, 0.303f)
                lineTo(6.58f, 6.993f)
                curveToRelative(0.042f, 0.041f, 0.061f, 0.1f, 0.051f, 0.158f)
                lineTo(6.39f, 8.565f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, false, 0.258f, 0.187f)
                lineToRelative(1.27f, -0.668f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, 0.165f, 0.0f)
                lineToRelative(1.27f, 0.668f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, false, 0.257f, -0.187f)
                lineTo(9.368f, 7.15f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, 0.05f, -0.158f)
                lineToRelative(1.028f, -1.001f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, false, -0.098f, -0.303f)
                lineToRelative(-1.42f, -0.206f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, true, -0.134f, -0.098f)
                close()
            }
        }
        .build()
        return _bookmarkStarFill!!
    }

private var _bookmarkStarFill: ImageVector? = null
