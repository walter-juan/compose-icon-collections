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

public val Twbs.EnvelopeOpenHeart: ImageVector
    get() {
        if (_envelopeOpenHeart != null) {
            return _envelopeOpenHeart!!
        }
        _envelopeOpenHeart = Builder(name = "EnvelopeOpenHeart", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.47f, 1.318f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.94f, 0.0f)
                lineToRelative(-6.0f, 3.2f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 1.0f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(3.235f, 1.94f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.233f, 1.027f)
                lineTo(1.0f, 7.384f)
                verticalLineToRelative(5.733f)
                lineToRelative(3.479f, -2.087f)
                quadToRelative(0.224f, 0.414f, 0.558f, 0.83f)
                lineToRelative(-4.002f, 2.402f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 15.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.965f, -0.738f)
                lineToRelative(-4.002f, -2.401f)
                quadToRelative(0.334f, -0.418f, 0.558f, -0.831f)
                lineTo(15.0f, 13.117f)
                verticalLineTo(7.383f)
                lineToRelative(-3.002f, 1.801f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.233f, -1.026f)
                lineTo(15.0f, 6.217f)
                verticalLineTo(5.4f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.53f, -0.882f)
                close()
                moveTo(7.06f, 0.435f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.882f, 0.0f)
                lineToRelative(6.0f, 3.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 5.4f)
                verticalLineTo(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineTo(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.059f, -1.765f)
                close()
                moveTo(8.0f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0.0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0.0f, -5.132f)
            }
        }
        .build()
        return _envelopeOpenHeart!!
    }

private var _envelopeOpenHeart: ImageVector? = null
