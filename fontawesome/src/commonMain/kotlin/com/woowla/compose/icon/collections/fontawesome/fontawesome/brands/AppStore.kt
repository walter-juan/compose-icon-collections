package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.AppStore: ImageVector
    get() {
        if (_appStore != null) {
            return _appStore!!
        }
        _appStore = Builder(name = "AppStore", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.9f, 120.9f)
                lineToRelative(9.1f, -15.7f)
                curveToRelative(5.6f, -9.8f, 18.1f, -13.1f, 27.9f, -7.5f)
                reflectiveCurveToRelative(13.1f, 18.1f, 7.5f, 27.9f)
                lineToRelative(-87.5f, 151.5f)
                lineToRelative(63.3f, 0.0f)
                curveToRelative(20.5f, 0.0f, 32.0f, 24.1f, 23.1f, 40.8f)
                lineToRelative(-185.5f, 0.0f)
                curveToRelative(-11.3f, 0.0f, -20.4f, -9.1f, -20.4f, -20.4f)
                reflectiveCurveToRelative(9.1f, -20.4f, 20.4f, -20.4f)
                lineToRelative(52.0f, 0.0f)
                lineToRelative(66.6f, -115.4f)
                lineToRelative(-20.8f, -36.1f)
                curveToRelative(-5.6f, -9.8f, -2.3f, -22.2f, 7.5f, -27.9f)
                curveToRelative(9.8f, -5.6f, 22.2f, -2.3f, 27.9f, 7.5f)
                lineToRelative(8.9f, 15.7f)
                close()
                moveTo(177.2f, 338.9f)
                lineToRelative(-19.6f, 34.0f)
                curveToRelative(-5.6f, 9.8f, -18.1f, 13.1f, -27.9f, 7.5f)
                reflectiveCurveToRelative(-13.1f, -18.1f, -7.5f, -27.9f)
                lineToRelative(14.6f, -25.2f)
                curveToRelative(16.4f, -5.1f, 29.8f, -1.2f, 40.4f, 11.6f)
                close()
                moveTo(346.1f, 277.2f)
                lineToRelative(53.1f, 0.0f)
                curveToRelative(11.3f, 0.0f, 20.4f, 9.1f, 20.4f, 20.4f)
                reflectiveCurveTo(410.5f, 318.0f, 399.2f, 318.0f)
                lineToRelative(-29.5f, 0.0f)
                lineToRelative(19.9f, 34.5f)
                curveToRelative(5.6f, 9.8f, 2.3f, 22.2f, -7.5f, 27.9f)
                curveToRelative(-9.8f, 5.6f, -22.2f, 2.3f, -27.9f, -7.5f)
                curveToRelative(-33.5f, -58.1f, -58.7f, -101.6f, -75.4f, -130.6f)
                curveToRelative(-17.1f, -29.5f, -4.9f, -59.1f, 7.2f, -69.1f)
                curveToRelative(13.4f, 23.0f, 33.4f, 57.7f, 60.1f, 104.0f)
                close()
                moveTo(256.0f, 8.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, 496.0f)
                arcToRelative(248.0f, 248.0f, 0.0f, true, false, 0.0f, -496.0f)
                close()
                moveTo(40.0f, 256.0f)
                arcToRelative(216.0f, 216.0f, 0.0f, true, true, 432.0f, 0.0f)
                arcToRelative(216.0f, 216.0f, 0.0f, true, true, -432.0f, 0.0f)
                close()
            }
        }
        .build()
        return _appStore!!
    }

private var _appStore: ImageVector? = null
