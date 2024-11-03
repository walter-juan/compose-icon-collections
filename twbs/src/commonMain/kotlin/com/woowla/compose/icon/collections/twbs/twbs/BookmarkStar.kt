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

public val Twbs.BookmarkStar: ImageVector
    get() {
        if (_bookmarkStar != null) {
            return _bookmarkStar!!
        }
        _bookmarkStar = Builder(name = "BookmarkStar", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.84f, 4.1f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, 0.32f, 0.0f)
                lineToRelative(0.634f, 1.285f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.134f, 0.098f)
                lineToRelative(1.42f, 0.206f)
                curveToRelative(0.145f, 0.021f, 0.204f, 0.2f, 0.098f, 0.303f)
                lineTo(9.42f, 6.993f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.051f, 0.158f)
                lineToRelative(0.242f, 1.414f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, -0.258f, 0.187f)
                lineToRelative(-1.27f, -0.668f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.165f, 0.0f)
                lineToRelative(-1.27f, 0.668f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, -0.257f, -0.187f)
                lineToRelative(0.242f, -1.414f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, -0.05f, -0.158f)
                lineToRelative(-1.03f, -1.001f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, 0.098f, -0.303f)
                lineToRelative(1.42f, -0.206f)
                arcToRelative(0.18f, 0.18f, 0.0f, false, false, 0.134f, -0.098f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.777f, 0.416f)
                lineTo(8.0f, 13.101f)
                lineToRelative(-5.223f, 2.815f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 15.5f)
                close()
                moveTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(12.566f)
                lineToRelative(4.723f, -2.482f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.554f, 0.0f)
                lineTo(13.0f, 14.566f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _bookmarkStar!!
    }

private var _bookmarkStar: ImageVector? = null
