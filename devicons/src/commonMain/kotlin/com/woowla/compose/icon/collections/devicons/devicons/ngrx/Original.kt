package com.woowla.compose.icon.collections.devicons.devicons.ngrx

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
import com.woowla.compose.icon.collections.devicons.devicons.NgrxGroup

public val NgrxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF412846)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.1f, 1.4f)
                lineTo(5.6f, 21.7f)
                lineTo(14.0f, 99.3f)
                lineToRelative(50.1f, 27.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF4b314f)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.9f, 1.4f)
                lineToRelative(58.5f, 20.3f)
                lineToRelative(-8.4f, 77.6f)
                lineToRelative(-50.1f, 27.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFFba2bd2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.2f, 44.3f)
                lineToRelative(-0.1f, -0.1f)
                quadToRelative(4.0f, 4.5f, 4.2f, 10.6f)
                quadToRelative(0.1f, 6.1f, -4.2f, 12.9f)
                quadToRelative(3.2f, -2.5f, 7.4f, -10.6f)
                quadToRelative(1.8f, 16.5f, -13.5f, 25.1f)
                quadToRelative(4.9f, -0.4f, 12.9f, -6.4f)
                quadToRelative(-8.5f, 20.6f, -31.4f, 21.7f)
                curveToRelative(-14.8f, 0.0f, -24.3f, -8.8f, -24.3f, -8.8f)
                quadToRelative(-9.1f, -7.1f, -12.5f, -17.9f)
                curveToRelative(-3.7f, -3.9f, -3.7f, -4.3f, -4.1f, -5.9f)
                curveToRelative(-0.3f, -1.6f, 0.3f, -2.1f, 1.3f, -3.6f)
                quadToRelative(1.1f, -1.6f, 0.5f, -4.4f)
                quadToRelative(-1.3f, -1.9f, -1.5f, -5.9f)
                quadToRelative(0.0f, -2.0f, 2.6f, -4.1f)
                quadToRelative(2.6f, -2.2f, 3.1f, -3.3f)
                quadToRelative(0.5f, -0.6f, 0.4f, -5.4f)
                quadToRelative(-0.1f, -4.7f, 5.2f, -5.1f)
                curveToRelative(5.2f, -0.4f, 8.1f, -4.3f, 9.8f, -6.1f)
                curveToRelative(1.1f, -1.2f, 2.7f, -1.8f, 4.7f, -1.8f)
                curveToRelative(2.9f, -0.1f, 5.5f, 1.0f, 7.8f, 3.3f)
                curveToRelative(5.6f, -0.3f, 11.3f, 1.2f, 17.1f, 4.5f)
                quadTo(91.0f, 40.3f, 92.2f, 48.9f)
                quadToRelative(-1.4f, 11.3f, -30.2f, -0.6f)
                quadToRelative(-15.1f, 4.3f, -14.9f, 18.5f)
                quadToRelative(0.0f, 13.1f, 12.7f, 19.0f)
                curveToRelative(-4.1f, -4.0f, -5.9f, -7.4f, -5.3f, -10.2f)
                quadTo(67.3f, 90.8f, 83.6f, 87.0f)
                quadToRelative(-7.1f, 0.2f, -11.4f, -4.7f)
                quadTo(83.2f, 82.0f, 93.0f, 72.0f)
                quadToRelative(-5.6f, 4.5f, -11.9f, 3.4f)
                quadToRelative(17.0f, -13.3f, 12.1f, -31.1f)
                close()
                moveTo(74.2f, 41.2f)
                curveToRelative(0.0f, -0.9f, -0.7f, -1.6f, -1.6f, -1.6f)
                curveToRelative(-0.9f, 0.0f, -1.7f, 0.7f, -1.7f, 1.6f)
                curveToRelative(0.0f, 0.9f, 0.8f, 1.7f, 1.7f, 1.7f)
                curveToRelative(0.9f, 0.0f, 1.6f, -0.8f, 1.6f, -1.7f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
