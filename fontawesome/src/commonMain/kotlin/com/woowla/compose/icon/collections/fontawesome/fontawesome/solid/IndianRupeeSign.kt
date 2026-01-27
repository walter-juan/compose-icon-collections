package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.IndianRupeeSign: ImageVector
    get() {
        if (_indianRupeeSign != null) {
            return _indianRupeeSign!!
        }
        _indianRupeeSign = Builder(name = "IndianRupeeSign", defaultWidth = 320.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(264.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-76.7f, 0.0f)
                curveToRelative(17.7f, 19.8f, 30.1f, 44.6f, 34.7f, 72.0f)
                lineToRelative(42.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-42.0f, 0.0f)
                curveToRelative(-10.4f, 62.2f, -60.8f, 110.9f, -123.8f, 118.9f)
                lineTo(274.6f, 422.0f)
                curveToRelative(14.4f, 10.3f, 17.7f, 30.3f, 7.4f, 44.6f)
                reflectiveCurveToRelative(-30.3f, 17.7f, -44.6f, 7.4f)
                lineTo(13.4f, 314.0f)
                curveTo(2.1f, 306.0f, -2.7f, 291.5f, 1.5f, 278.2f)
                reflectiveCurveTo(18.1f, 256.0f, 32.0f, 256.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(35.8f, 0.0f, 66.1f, -23.5f, 76.3f, -56.0f)
                lineTo(24.0f, 200.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(164.3f, 0.0f)
                curveToRelative(-10.2f, -32.5f, -40.5f, -56.0f, -76.3f, -56.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _indianRupeeSign!!
    }

private var _indianRupeeSign: ImageVector? = null
