package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.ShieldFillExclamation: ImageVector
    get() {
        if (_shieldFillExclamation != null) {
            return _shieldFillExclamation!!
        }
        _shieldFillExclamation = Builder(name = "ShieldFillExclamation", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 0.0f)
                curveToRelative(-0.69f, 0.0f, -1.843f, 0.265f, -2.928f, 0.56f)
                curveToRelative(-1.11f, 0.3f, -2.229f, 0.655f, -2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, -1.044f, 1.262f)
                curveToRelative(-0.596f, 4.477f, 0.787f, 7.795f, 2.465f, 9.99f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 2.517f, -2.453f)
                curveToRelative(1.678f, -2.195f, 3.061f, -5.513f, 2.465f, -9.99f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, false, -1.044f, -1.263f)
                arcToRelative(63.0f, 63.0f, 0.0f, false, false, -2.887f, -0.87f)
                curveTo(9.843f, 0.266f, 8.69f, 0.0f, 8.0f, 0.0f)
                moveToRelative(-0.55f, 8.502f)
                lineTo(7.1f, 4.995f)
                arcToRelative(0.905f, 0.905f, 0.0f, true, true, 1.8f, 0.0f)
                lineToRelative(-0.35f, 3.507f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -1.1f, 0.0f)
                moveTo(8.002f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
            }
        }
        .build()
        return _shieldFillExclamation!!
    }

private var _shieldFillExclamation: ImageVector? = null
