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

public val Twbs.Badge3dFill: ImageVector
    get() {
        if (_badge3dFill != null) {
            return _badge3dFill!!
        }
        _badge3dFill = Builder(name = "Badge3dFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.157f, 5.968f)
                horizontalLineToRelative(-0.844f)
                verticalLineToRelative(4.06f)
                horizontalLineToRelative(0.844f)
                curveToRelative(1.116f, 0.0f, 1.621f, -0.667f, 1.621f, -2.02f)
                curveToRelative(0.0f, -1.354f, -0.51f, -2.04f, -1.621f, -2.04f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(2.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(5.184f, 8.368f)
                curveToRelative(0.646f, 0.0f, 1.055f, 0.378f, 1.06f, 0.9f)
                curveToRelative(0.008f, 0.537f, -0.427f, 0.919f, -1.086f, 0.919f)
                curveToRelative(-0.598f, -0.004f, -1.037f, -0.325f, -1.068f, -0.756f)
                lineTo(3.0f, 9.431f)
                curveToRelative(0.03f, 0.914f, 0.791f, 1.688f, 2.153f, 1.688f)
                curveToRelative(1.24f, 0.0f, 2.285f, -0.66f, 2.272f, -1.798f)
                curveToRelative(-0.013f, -0.953f, -0.747f, -1.38f, -1.292f, -1.432f)
                verticalLineToRelative(-0.062f)
                curveToRelative(0.44f, -0.07f, 1.125f, -0.527f, 1.108f, -1.375f)
                curveToRelative(-0.013f, -0.906f, -0.8f, -1.57f, -2.053f, -1.565f)
                curveToRelative(-1.31f, 0.005f, -2.043f, 0.734f, -2.074f, 1.67f)
                horizontalLineToRelative(1.103f)
                curveToRelative(0.022f, -0.391f, 0.383f, -0.751f, 0.936f, -0.751f)
                curveToRelative(0.532f, 0.0f, 0.928f, 0.33f, 0.928f, 0.813f)
                curveToRelative(0.004f, 0.479f, -0.383f, 0.835f, -0.928f, 0.835f)
                horizontalLineToRelative(-0.632f)
                verticalLineToRelative(0.914f)
                close()
                moveTo(8.126f, 11.0f)
                horizontalLineToRelative(2.189f)
                curveTo(12.125f, 11.0f, 13.0f, 9.893f, 13.0f, 7.985f)
                curveToRelative(0.0f, -1.894f, -0.861f, -2.984f, -2.685f, -2.984f)
                lineTo(8.126f, 5.001f)
                close()
            }
        }
        .build()
        return _badge3dFill!!
    }

private var _badge3dFill: ImageVector? = null
