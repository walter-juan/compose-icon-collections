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

public val Twbs.PinAngleFill: ImageVector
    get() {
        if (_pinAngleFill != null) {
            return _pinAngleFill!!
        }
        _pinAngleFill = Builder(name = "PinAngleFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.828f, 0.722f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.354f, 0.146f)
                lineToRelative(4.95f, 4.95f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.707f)
                curveToRelative(-0.48f, 0.48f, -1.072f, 0.588f, -1.503f, 0.588f)
                curveToRelative(-0.177f, 0.0f, -0.335f, -0.018f, -0.46f, -0.039f)
                lineToRelative(-3.134f, 3.134f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.16f, 1.013f)
                curveToRelative(0.046f, 0.702f, -0.032f, 1.687f, -0.72f, 2.375f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, 0.0f)
                lineToRelative(-2.829f, -2.828f)
                lineToRelative(-3.182f, 3.182f)
                curveToRelative(-0.195f, 0.195f, -1.219f, 0.902f, -1.414f, 0.707f)
                reflectiveCurveToRelative(0.512f, -1.22f, 0.707f, -1.414f)
                lineToRelative(3.182f, -3.182f)
                lineToRelative(-2.828f, -2.829f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.707f)
                curveToRelative(0.688f, -0.688f, 1.673f, -0.767f, 2.375f, -0.72f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.013f, 0.16f)
                lineToRelative(3.134f, -3.133f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.04f, -0.461f)
                curveToRelative(0.0f, -0.43f, 0.108f, -1.022f, 0.589f, -1.503f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.353f, -0.146f)
            }
        }
        .build()
        return _pinAngleFill!!
    }

private var _pinAngleFill: ImageVector? = null
