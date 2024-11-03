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

public val Twbs.EnvelopeOpenHeartFill: ImageVector
    get() {
        if (_envelopeOpenHeartFill != null) {
            return _envelopeOpenHeartFill!!
        }
        _envelopeOpenHeartFill = Builder(name = "EnvelopeOpenHeartFill", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.941f, 0.435f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.882f, 0.0f)
                lineToRelative(-6.0f, 3.2f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 5.4f)
                verticalLineToRelative(0.313f)
                lineToRelative(4.222f, 2.475f)
                quadToRelative(0.035f, -0.087f, 0.08f, -0.17f)
                curveToRelative(0.665f, -1.3f, 2.362f, -1.917f, 3.698f, -1.25f)
                curveToRelative(1.336f, -0.667f, 3.033f, -0.05f, 3.699f, 1.25f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.08f, 0.17f)
                lineTo(16.0f, 5.713f)
                lineTo(16.0f, 5.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.059f, -1.765f)
                close()
                moveTo(0.0f, 6.873f)
                lineToRelative(4.0f, 2.344f)
                curveToRelative(-0.012f, 0.542f, 0.124f, 1.117f, 0.416f, 1.694f)
                lineToRelative(0.004f, 0.006f)
                lineTo(0.0f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(0.059f, 14.484f)
                lineTo(4.959f, 11.761f)
                curveToRelative(0.563f, 0.73f, 1.383f, 1.467f, 2.49f, 2.198f)
                lineToRelative(0.551f, 0.365f)
                lineToRelative(0.551f, -0.365f)
                curveToRelative(1.107f, -0.73f, 1.927f, -1.467f, 2.49f, -2.198f)
                lineToRelative(4.9f, 2.723f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 16.0f)
                lineTo(2.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.941f, -1.516f)
                moveTo(16.0f, 13.372f)
                lineToRelative(-4.42f, -2.455f)
                lineToRelative(0.004f, -0.006f)
                curveToRelative(0.292f, -0.577f, 0.428f, -1.152f, 0.415f, -1.694f)
                lineTo(16.0f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.993f)
                curveToRelative(1.664f, -1.711f, 5.825f, 1.283f, 0.0f, 5.132f)
                curveToRelative(-5.825f, -3.85f, -1.664f, -6.843f, 0.0f, -5.132f)
            }
        }
        .build()
        return _envelopeOpenHeartFill!!
    }

private var _envelopeOpenHeartFill: ImageVector? = null
