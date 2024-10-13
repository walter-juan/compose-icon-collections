package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsBrightness: ImageVector
    get() {
        if (_bxsBrightness != null) {
            return _bxsBrightness!!
        }
        _bxsBrightness = Builder(name = "BxsBrightness", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.546f, 11.646f)
                lineTo(19.0f, 9.101f)
                verticalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-3.601f)
                lineToRelative(-2.546f, -2.546f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.707f, 0.0f)
                lineTo(9.101f, 5.0f)
                horizontalLineTo(5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(3.601f)
                lineToRelative(-2.546f, 2.546f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.707f)
                lineTo(5.0f, 14.899f)
                verticalLineTo(18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(3.601f)
                lineToRelative(2.546f, 2.546f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.707f, 0.0f)
                lineTo(14.899f, 19.0f)
                horizontalLineTo(18.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-3.601f)
                lineToRelative(2.546f, -2.546f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -0.707f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _bxsBrightness!!
    }

private var _bxsBrightness: ImageVector? = null
