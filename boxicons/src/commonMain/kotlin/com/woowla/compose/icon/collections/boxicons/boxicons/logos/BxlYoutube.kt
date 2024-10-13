package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlYoutube: ImageVector
    get() {
        if (_bxlYoutube != null) {
            return _bxlYoutube!!
        }
        _bxlYoutube = Builder(name = "BxlYoutube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.593f, 7.203f)
                arcToRelative(2.506f, 2.506f, 0.0f, false, false, -1.762f, -1.766f)
                curveTo(18.265f, 5.007f, 12.0f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveToRelative(-6.264f, -0.007f, -7.831f, 0.404f)
                arcToRelative(2.56f, 2.56f, 0.0f, false, false, -1.766f, 1.778f)
                curveToRelative(-0.413f, 1.566f, -0.417f, 4.814f, -0.417f, 4.814f)
                reflectiveCurveToRelative(-0.004f, 3.264f, 0.406f, 4.814f)
                curveToRelative(0.23f, 0.857f, 0.905f, 1.534f, 1.763f, 1.765f)
                curveToRelative(1.582f, 0.43f, 7.83f, 0.437f, 7.83f, 0.437f)
                reflectiveCurveToRelative(6.265f, 0.007f, 7.831f, -0.403f)
                arcToRelative(2.515f, 2.515f, 0.0f, false, false, 1.767f, -1.763f)
                curveToRelative(0.414f, -1.565f, 0.417f, -4.812f, 0.417f, -4.812f)
                reflectiveCurveToRelative(0.02f, -3.265f, -0.407f, -4.831f)
                close()
                moveTo(9.996f, 15.005f)
                lineToRelative(0.005f, -6.0f)
                lineToRelative(5.207f, 3.005f)
                lineToRelative(-5.212f, 2.995f)
                close()
            }
        }
        .build()
        return _bxlYoutube!!
    }

private var _bxlYoutube: ImageVector? = null
