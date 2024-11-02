package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Appium: ImageVector
    get() {
        if (_appium != null) {
            return _appium!!
        }
        _appium = Builder(name = "Appium", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.923f, 0.0f)
                curveTo(5.937f, 0.0f, 0.976f, 4.384f, 0.07f, 10.115f)
                arcToRelative(11.943f, 11.943f, 0.0f, false, true, 7.645f, -2.754f)
                arcToRelative(11.982f, 11.982f, 0.0f, false, true, 9.43f, 4.58f)
                arcToRelative(11.942f, 11.942f, 0.0f, false, false, 1.015f, -8.769f)
                arcToRelative(12.066f, 12.066f, 0.0f, false, false, -0.626f, -1.772f)
                lineToRelative(-0.003f, -0.008f)
                arcTo(11.968f, 11.968f, 0.0f, false, false, 11.923f, 0.0f)
                close()
                moveTo(19.644f, 2.754f)
                arcTo(12.002f, 12.002f, 0.0f, false, true, 9.398f, 16.521f)
                arcToRelative(12.082f, 12.082f, 0.0f, false, false, 9.02f, 5.617f)
                curveToRelative(0.24f, -0.119f, 0.766f, -0.51f, 1.224f, -0.89f)
                arcTo(11.971f, 11.971f, 0.0f, false, false, 23.995f, 12.0f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, false, -4.35f, -9.247f)
                close()
                moveTo(9.33f, 7.557f)
                arcToRelative(12.159f, 12.159f, 0.0f, false, false, -2.647f, 0.401f)
                arcTo(11.944f, 11.944f, 0.0f, false, false, 0.01f, 12.595f)
                lineToRelative(-0.005f, 0.006f)
                curveToRelative(0.021f, 0.427f, 0.065f, 0.853f, 0.131f, 1.275f)
                curveTo(1.037f, 19.61f, 6.0f, 24.0f, 11.991f, 24.0f)
                curveToRelative(1.45f, 0.0f, 2.887f, -0.26f, 4.243f, -0.773f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.905f, -15.67f)
                close()
            }
        }
        .build()
        return _appium!!
    }

private var _appium: ImageVector? = null
