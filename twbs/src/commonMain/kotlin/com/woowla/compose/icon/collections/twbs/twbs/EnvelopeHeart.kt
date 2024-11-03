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

public val Twbs.EnvelopeHeart: ImageVector
    get() {
        if (_envelopeHeart != null) {
            return _envelopeHeart!!
        }
        _envelopeHeart = Builder(name = "EnvelopeHeart", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(2.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(0.217f)
                lineToRelative(3.235f, 1.94f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.233f, 1.027f)
                lineTo(1.0f, 5.384f)
                verticalLineToRelative(5.721f)
                lineToRelative(3.453f, -2.124f)
                quadToRelative(0.219f, 0.416f, 0.55f, 0.835f)
                lineToRelative(-3.97f, 2.443f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 13.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.966f, -0.741f)
                lineToRelative(-3.968f, -2.442f)
                quadToRelative(0.33f, -0.421f, 0.55f, -0.836f)
                lineTo(15.0f, 11.105f)
                lineTo(15.0f, 5.383f)
                lineToRelative(-3.002f, 1.801f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, -0.233f, -1.026f)
                lineTo(15.0f, 4.217f)
                lineTo(15.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(8.0f, 5.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0.0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0.0f, -5.132f)
            }
        }
        .build()
        return _envelopeHeart!!
    }

private var _envelopeHeart: ImageVector? = null
