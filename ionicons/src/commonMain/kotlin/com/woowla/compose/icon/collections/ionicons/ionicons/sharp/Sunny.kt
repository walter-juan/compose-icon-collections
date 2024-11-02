package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

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
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.Sunny: ImageVector
    get() {
        if (_sunny != null) {
            return _sunny!!
        }
        _sunny = Builder(name = "Sunny", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 26.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(92.0f)
                horizontalLineToRelative(-44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 394.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(92.0f)
                horizontalLineToRelative(-44.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.03f, 142.86f)
                lineToRelative(65.05f, -65.05f)
                lineToRelative(31.11f, 31.11f)
                lineToRelative(-65.05f, 65.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.82f, 403.07f)
                lineToRelative(65.05f, -65.05f)
                lineToRelative(31.11f, 31.11f)
                lineToRelative(-65.05f, 65.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.0f, 234.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(-92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 234.0f)
                horizontalLineToRelative(92.0f)
                verticalLineToRelative(44.0f)
                horizontalLineToRelative(-92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(338.03f, 369.14f)
                lineToRelative(31.11f, -31.11f)
                lineToRelative(65.05f, 65.05f)
                lineToRelative(-31.11f, 31.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(77.8f, 108.92f)
                lineToRelative(31.11f, -31.11f)
                lineToRelative(65.05f, 65.05f)
                lineToRelative(-31.11f, 31.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 358.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 358.0f, 256.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 256.0f, 358.0f)
                close()
            }
        }
        .build()
        return _sunny!!
    }

private var _sunny: ImageVector? = null
