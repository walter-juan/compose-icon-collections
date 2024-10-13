package com.woowla.compose.icon.collections.devicons.devicons.linkedin

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
import com.woowla.compose.icon.collections.devicons.devicons.LinkedinGroup

public val LinkedinGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0076b2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 3.0f)
                horizontalLineTo(12.0f)
                arcToRelative(8.91f, 8.91f, 0.0f, false, false, -9.0f, 8.8f)
                verticalLineToRelative(104.42f)
                arcToRelative(8.91f, 8.91f, 0.0f, false, false, 9.0f, 8.78f)
                horizontalLineToRelative(104.0f)
                arcToRelative(8.93f, 8.93f, 0.0f, false, false, 9.0f, -8.81f)
                verticalLineTo(11.77f)
                arcTo(8.93f, 8.93f, 0.0f, false, false, 116.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.06f, 48.73f)
                horizontalLineToRelative(18.11f)
                lineTo(39.17f, 107.0f)
                lineTo(21.06f, 107.0f)
                close()
                moveTo(30.12f, 19.73f)
                arcToRelative(10.5f, 10.5f, 0.0f, true, true, -10.5f, 10.49f)
                arcToRelative(10.5f, 10.5f, 0.0f, false, true, 10.5f, -10.49f)
                moveTo(50.53f, 48.73f)
                horizontalLineToRelative(17.36f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(0.24f)
                curveToRelative(2.42f, -4.58f, 8.32f, -9.41f, 17.13f, -9.41f)
                curveTo(103.6f, 47.28f, 107.0f, 59.35f, 107.0f, 75.0f)
                verticalLineToRelative(32.0f)
                lineTo(88.89f, 107.0f)
                lineTo(88.89f, 78.65f)
                curveToRelative(0.0f, -6.75f, -0.12f, -15.44f, -9.41f, -15.44f)
                reflectiveCurveToRelative(-10.87f, 7.36f, -10.87f, 15.0f)
                lineTo(68.61f, 107.0f)
                lineTo(50.53f, 107.0f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
