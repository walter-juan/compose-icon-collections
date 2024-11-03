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

public val Twbs.EnvelopePaperFill: ImageVector
    get() {
        if (_envelopePaperFill != null) {
            return _envelopePaperFill!!
        }
        _envelopePaperFill = Builder(name = "EnvelopePaperFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.5f, 9.5f)
                lineTo(3.0f, 7.5f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 0.0f)
                horizontalLineToRelative(7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 1.5f)
                verticalLineToRelative(6.0f)
                lineToRelative(-3.5f, 2.0f)
                lineTo(8.0f, 8.75f)
                close()
                moveTo(1.059f, 3.635f)
                lineTo(2.0f, 3.133f)
                verticalLineToRelative(3.753f)
                lineTo(0.0f, 5.713f)
                lineTo(0.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.059f, -1.765f)
                moveTo(16.0f, 5.713f)
                lineToRelative(-2.0f, 1.173f)
                lineTo(14.0f, 3.133f)
                lineToRelative(0.941f, 0.502f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 5.4f)
                close()
                moveTo(16.0f, 6.873f)
                lineTo(10.307f, 10.21f)
                lineTo(16.0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(8.0f, 10.072f)
                lineTo(15.941f, 14.484f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.941f, -1.516f)
                close()
                moveTo(0.0f, 13.372f)
                lineTo(5.693f, 10.21f)
                lineTo(0.0f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
            }
        }
        .build()
        return _envelopePaperFill!!
    }

private var _envelopePaperFill: ImageVector? = null
