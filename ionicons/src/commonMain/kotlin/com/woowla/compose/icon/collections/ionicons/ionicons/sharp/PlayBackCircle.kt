package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.PlayBackCircle: ImageVector
    get() {
        if (_playBackCircle != null) {
            return _playBackCircle!!
        }
        _playBackCircle = Builder(name = "PlayBackCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                curveToRelative(0.0f, 114.69f, 93.31f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.31f, 208.0f, -208.0f)
                reflectiveCurveTo(370.69f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveTo(48.0f, 141.31f, 48.0f, 256.0f)
                close()
                moveTo(111.47f, 256.0f)
                lineTo(248.0f, 168.0f)
                verticalLineToRelative(72.16f)
                lineToRelative(120.0f, -72.48f)
                lineTo(368.0f, 344.13f)
                lineTo(248.0f, 271.81f)
                verticalLineToRelative(71.44f)
                close()
            }
        }
        .build()
        return _playBackCircle!!
    }

private var _playBackCircle: ImageVector? = null
