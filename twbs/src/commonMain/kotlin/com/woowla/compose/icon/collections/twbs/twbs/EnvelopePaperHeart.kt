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

public val Twbs.EnvelopePaperHeart: ImageVector
    get() {
        if (_envelopePaperHeart != null) {
            return _envelopePaperHeart!!
        }
        _envelopePaperHeart = Builder(name = "EnvelopePaperHeart", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(1.133f)
                lineToRelative(0.941f, 0.502f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 5.4f)
                lineTo(16.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(0.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.059f, -1.765f)
                lineTo(2.0f, 3.133f)
                close()
                moveTo(2.0f, 4.267f)
                lineTo(1.53f, 4.517f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(1.0f, 0.6f)
                close()
                moveTo(3.0f, 7.417f)
                lineTo(6.75f, 9.667f)
                lineTo(8.0f, 8.917f)
                lineToRelative(1.25f, 0.75f)
                lineTo(13.0f, 7.417f)
                lineTo(13.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(4.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                close()
                moveTo(14.0f, 6.817f)
                lineTo(15.0f, 6.217f)
                lineTo(15.0f, 5.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.53f, -0.882f)
                lineTo(14.0f, 4.267f)
                close()
                moveTo(8.0f, 2.982f)
                curveTo(9.664f, 1.309f, 13.825f, 4.236f, 8.0f, 8.0f)
                curveTo(2.175f, 4.236f, 6.336f, 1.31f, 8.0f, 2.982f)
                moveToRelative(7.0f, 4.401f)
                lineToRelative(-4.778f, 2.867f)
                lineTo(15.0f, 13.117f)
                close()
                moveTo(14.965f, 14.263f)
                lineTo(8.0f, 10.082f)
                lineToRelative(-6.965f, 4.18f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.965f, -0.738f)
                close()
                moveTo(1.0f, 13.116f)
                lineToRelative(4.778f, -2.867f)
                lineTo(1.0f, 7.383f)
                verticalLineToRelative(5.734f)
                close()
            }
        }
        .build()
        return _envelopePaperHeart!!
    }

private var _envelopePaperHeart: ImageVector? = null
