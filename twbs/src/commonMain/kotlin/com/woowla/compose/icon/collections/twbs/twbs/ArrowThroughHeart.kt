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

public val Twbs.ArrowThroughHeart: ImageVector
    get() {
        if (_arrowThroughHeart != null) {
            return _arrowThroughHeart!!
        }
        _arrowThroughHeart = Builder(name = "ArrowThroughHeart", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.854f, 15.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 15.5f)
                lineTo(2.0f, 14.0f)
                lineTo(0.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.354f, -0.854f)
                lineToRelative(1.5f, -1.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 2.0f, 11.5f)
                horizontalLineToRelative(1.793f)
                lineToRelative(0.53f, -0.53f)
                curveToRelative(-0.771f, -0.802f, -1.328f, -1.58f, -1.704f, -2.32f)
                curveToRelative(-0.798f, -1.575f, -0.775f, -2.996f, -0.213f, -4.092f)
                curveTo(3.426f, 2.565f, 6.18f, 1.809f, 8.0f, 3.233f)
                curveToRelative(1.25f, -0.98f, 2.944f, -0.928f, 4.212f, -0.152f)
                lineTo(13.292f, 2.0f)
                lineTo(12.147f, 0.854f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 12.5f, 0.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.854f, 0.354f)
                lineTo(14.0f, 2.707f)
                lineToRelative(-1.006f, 1.006f)
                curveToRelative(0.236f, 0.248f, 0.44f, 0.531f, 0.6f, 0.845f)
                curveToRelative(0.562f, 1.096f, 0.585f, 2.517f, -0.213f, 4.092f)
                curveToRelative(-0.793f, 1.563f, -2.395f, 3.288f, -5.105f, 5.08f)
                lineTo(8.0f, 13.912f)
                lineToRelative(-0.276f, -0.182f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -2.685f, -2.062f)
                lineToRelative(-0.539f, 0.54f)
                lineTo(4.5f, 14.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.146f, 0.354f)
                close()
                moveTo(5.747f, 10.96f)
                arcTo(20.4f, 20.4f, 0.0f, false, false, 8.0f, 12.71f)
                curveToRelative(2.456f, -1.666f, 3.827f, -3.207f, 4.489f, -4.512f)
                curveToRelative(0.679f, -1.34f, 0.607f, -2.42f, 0.215f, -3.185f)
                curveToRelative(-0.817f, -1.595f, -3.087f, -2.054f, -4.346f, -0.761f)
                lineTo(8.0f, 4.62f)
                lineToRelative(-0.358f, -0.368f)
                curveToRelative(-1.259f, -1.293f, -3.53f, -0.834f, -4.346f, 0.761f)
                curveToRelative(-0.392f, 0.766f, -0.464f, 1.845f, 0.215f, 3.185f)
                curveToRelative(0.323f, 0.636f, 0.815f, 1.33f, 1.519f, 2.065f)
                lineToRelative(1.866f, -1.867f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, 0.708f)
                close()
            }
        }
        .build()
        return _arrowThroughHeart!!
    }

private var _arrowThroughHeart: ImageVector? = null
