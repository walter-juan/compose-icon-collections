package com.woowla.compose.icon.collections.ionicons.ionicons.outline

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
import com.woowla.compose.icon.collections.ionicons.ionicons.OutlineGroup

public val OutlineGroup.PlaySkipForwardCircle: ImageVector
    get() {
        if (_playSkipForwardCircle != null) {
            return _playSkipForwardCircle!!
        }
        _playSkipForwardCircle = Builder(name = "PlaySkipForwardCircle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(53.0f)
                lineTo(192.32f, 177.56f)
                arcTo(10.78f, 10.78f, 0.0f, false, false, 176.0f, 186.87f)
                verticalLineTo(325.13f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, false, 16.32f, 9.31f)
                lineTo(304.0f, 267.0f)
                verticalLineToRelative(53.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 32.0f, 0.0f)
                verticalLineTo(192.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 320.0f, 176.0f)
                close()
            }
        }
        .build()
        return _playSkipForwardCircle!!
    }

private var _playSkipForwardCircle: ImageVector? = null
