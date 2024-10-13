package com.woowla.compose.icon.collections.devicons.devicons.labview

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
import com.woowla.compose.icon.collections.devicons.devicons.LabviewGroup

public val LabviewGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFbec7cc)), stroke = null, fillAlpha = 0.998f,
                    strokeAlpha = 0.998f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(105.08f, 59.84f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, 3.54f)
                verticalLineToRelative(1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, 3.54f)
                horizontalLineToRelative(19.38f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, -3.54f)
                verticalLineToRelative(-1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, -3.54f)
                close()
                moveTo(3.54f, 41.8f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, 3.54f)
                verticalLineToRelative(1.35f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, 3.54f)
                horizontalLineToRelative(19.38f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, -3.54f)
                verticalLineToRelative(-1.35f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, -3.54f)
                close()
                moveTo(3.54f, 77.87f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, 3.54f)
                verticalLineToRelative(1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, 3.54f)
                horizontalLineToRelative(19.38f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, 3.54f, -3.54f)
                verticalLineToRelative(-1.34f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, false, -3.54f, -3.54f)
                close()
            }
            path(fill = SolidColor(Color(0xFFffd500)), stroke = null, fillAlpha = 0.998f,
                    strokeAlpha = 0.998f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(29.75f, 22.46f)
                curveToRelative(-4.42f, -0.09f, -8.06f, 2.99f, -8.06f, 6.82f)
                verticalLineToRelative(69.43f)
                curveToRelative(0.0f, 5.25f, 6.56f, 8.53f, 11.81f, 5.91f)
                lineToRelative(69.49f, -34.72f)
                curveToRelative(5.25f, -2.62f, 5.25f, -9.18f, 0.0f, -11.8f)
                lineToRelative(-69.49f, -34.72f)
                arcToRelative(8.86f, 8.86f, 0.0f, false, false, -3.75f, -0.91f)
                close()
            }
            path(fill = SolidColor(Color(0xFF727b84)), stroke = null, fillAlpha = 0.998f,
                    strokeAlpha = 0.998f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(64.54f, 67.07f)
                horizontalLineToRelative(-11.95f)
                verticalLineToRelative(11.99f)
                horizontalLineToRelative(-6.15f)
                verticalLineTo(67.08f)
                horizontalLineToRelative(-11.95f)
                verticalLineTo(61.0f)
                horizontalLineToRelative(11.95f)
                verticalLineTo(49.02f)
                horizontalLineToRelative(6.15f)
                verticalLineToRelative(11.99f)
                horizontalLineToRelative(11.95f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
