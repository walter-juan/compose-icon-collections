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

public val Twbs.EnvelopePaperHeartFill: ImageVector
    get() {
        if (_envelopePaperHeartFill != null) {
            return _envelopePaperHeartFill!!
        }
        _envelopePaperHeartFill = Builder(name = "EnvelopePaperHeartFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveToRelative(3.0f, 7.5f)
                lineToRelative(3.5f, 2.0f)
                lineTo(8.0f, 8.75f)
                lineToRelative(1.5f, 0.75f)
                lineToRelative(3.5f, -2.0f)
                verticalLineToRelative(-6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 0.0f)
                horizontalLineToRelative(-7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 3.0f, 1.5f)
                close()
                moveTo(2.0f, 3.133f)
                lineToRelative(-0.941f, 0.502f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.4f)
                verticalLineToRelative(0.313f)
                lineToRelative(2.0f, 1.173f)
                close()
                moveTo(14.0f, 6.886f)
                lineTo(16.0f, 5.713f)
                lineTo(16.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.059f, -1.765f)
                lineTo(14.0f, 3.133f)
                close()
                moveTo(10.307f, 10.21f)
                lineTo(16.0f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(15.941f, 14.484f)
                lineTo(8.0f, 10.072f)
                lineTo(0.059f, 14.484f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 16.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.941f, -1.516f)
                moveTo(5.693f, 10.21f)
                lineTo(0.0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(8.0f, 1.982f)
                curveTo(9.664f, 0.309f, 13.825f, 3.236f, 8.0f, 7.0f)
                curveTo(2.175f, 3.236f, 6.336f, 0.31f, 8.0f, 1.982f)
            }
        }
        .build()
        return _envelopePaperHeartFill!!
    }

private var _envelopePaperHeartFill: ImageVector? = null
