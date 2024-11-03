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

public val Twbs.EnvelopePaper: ImageVector
    get() {
        if (_envelopePaper != null) {
            return _envelopePaper!!
        }
        _envelopePaper = Builder(name = "EnvelopePaper", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(1.133f)
                lineToRelative(-0.941f, 0.502f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.4f)
                lineTo(0.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(16.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.059f, -1.765f)
                lineTo(14.0f, 3.133f)
                lineTo(14.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 4.267f)
                lineTo(14.47f, 4.517f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(-1.0f, 0.6f)
                close()
                moveTo(13.0f, 7.417f)
                lineTo(9.25f, 9.667f)
                lineTo(8.0f, 8.917f)
                lineToRelative(-1.25f, 0.75f)
                lineTo(3.0f, 7.417f)
                lineTo(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                close()
                moveTo(2.0f, 6.817f)
                lineTo(1.0f, 6.217f)
                lineTo(1.0f, 5.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.53f, -0.882f)
                lineTo(2.0f, 4.267f)
                close()
                moveTo(15.0f, 7.383f)
                verticalLineToRelative(5.734f)
                lineToRelative(-4.778f, -2.867f)
                close()
                moveTo(14.965f, 14.263f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.965f, -0.738f)
                lineTo(8.0f, 10.083f)
                close()
                moveTo(1.0f, 13.116f)
                lineTo(1.0f, 7.383f)
                lineToRelative(4.778f, 2.867f)
                lineTo(1.0f, 13.117f)
                close()
            }
        }
        .build()
        return _envelopePaper!!
    }

private var _envelopePaper: ImageVector? = null
