package com.woowla.compose.icon.collections.devicons.devicons.capacitor

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
import com.woowla.compose.icon.collections.devicons.devicons.CapacitorGroup

public val CapacitorGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF53b9ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.93f, 27.06f)
                lineTo(0.16f, 46.86f)
                lineToRelative(30.5f, 30.59f)
                lineTo(0.0f, 108.19f)
                lineToRelative(19.72f, 19.81f)
                lineTo(50.43f, 97.25f)
                lineToRelative(30.55f, 30.53f)
                lineToRelative(19.78f, -19.8f)
                close()
                moveTo(19.93f, 27.06f)
            }
            path(fill = SolidColor(Color(0xFF119eff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.26f, 77.45f)
                lineTo(50.43f, 97.25f)
                lineToRelative(30.55f, 30.53f)
                lineToRelative(19.78f, -19.8f)
                close()
                moveTo(70.26f, 77.45f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(70.26f, 77.45f)
                lineTo(50.43f, 97.25f)
                lineToRelative(7.63f, 7.59f)
                close()
                moveTo(70.26f, 77.45f)
            }
            path(fill = SolidColor(Color(0xFF53b9ff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.29f, 50.49f)
                lineTo(128.0f, 19.74f)
                lineTo(108.21f, 0.0f)
                lineTo(77.51f, 30.69f)
                lineTo(46.96f, 0.16f)
                lineTo(27.18f, 19.96f)
                lineToRelative(80.82f, 80.92f)
                lineToRelative(19.78f, -19.8f)
                close()
                moveTo(97.29f, 50.49f)
            }
            path(fill = SolidColor(Color(0xFF119eff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(57.68f, 50.49f)
                lineToRelative(19.83f, -19.8f)
                lineTo(46.96f, 0.16f)
                lineTo(27.18f, 19.96f)
                close()
                moveTo(57.68f, 50.49f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(57.68f, 50.49f)
                lineToRelative(19.83f, -19.8f)
                lineToRelative(-7.63f, -7.59f)
                close()
                moveTo(57.68f, 50.49f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
