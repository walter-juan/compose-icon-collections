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

public val SolidGroup.LandmarkDome: ImageVector
    get() {
        if (_landmarkDome != null) {
            return _landmarkDome!!
        }
        _landmarkDome = Builder(name = "LandmarkDome", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 0.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 10.7f)
                curveTo(368.4f, 48.1f, 431.9f, 111.6f, 445.3f, 192.0f)
                lineToRelative(2.7f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(2.7f, 0.0f)
                curveTo(80.1f, 111.6f, 143.6f, 48.1f, 224.0f, 34.7f)
                lineTo(224.0f, 24.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(64.0f, 288.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 132.3f)
                curveToRelative(0.6f, 0.3f, 1.2f, 0.7f, 1.8f, 1.1f)
                lineToRelative(48.0f, 32.0f)
                curveToRelative(11.7f, 7.8f, 17.0f, 22.4f, 12.9f, 35.9f)
                reflectiveCurveTo(494.1f, 512.0f, 480.0f, 512.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-14.1f, 0.0f, -26.5f, -9.2f, -30.6f, -22.7f)
                reflectiveCurveToRelative(1.1f, -28.1f, 12.9f, -35.9f)
                lineToRelative(48.0f, -32.0f)
                curveToRelative(0.6f, -0.4f, 1.2f, -0.7f, 1.8f, -1.1f)
                lineTo(64.0f, 288.0f)
                close()
            }
        }
        .build()
        return _landmarkDome!!
    }

private var _landmarkDome: ImageVector? = null
