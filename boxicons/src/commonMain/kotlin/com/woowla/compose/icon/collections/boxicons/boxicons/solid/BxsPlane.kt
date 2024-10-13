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

public val SolidGroup.BxsPlane: ImageVector
    get() {
        if (_bxsPlane != null) {
            return _bxsPlane!!
        }
        _bxsPlane = Builder(name = "BxsPlane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.21f)
                verticalLineToRelative(-1.895f)
                lineTo(14.0f, 8.0f)
                verticalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -4.0f, 0.0f)
                verticalLineToRelative(4.105f)
                lineTo(2.0f, 14.42f)
                verticalLineToRelative(1.789f)
                lineToRelative(8.0f, -2.81f)
                verticalLineTo(18.0f)
                lineToRelative(-3.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(5.0f, -2.0f)
                lineToRelative(5.0f, 2.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-3.0f, -2.0f)
                verticalLineToRelative(-4.685f)
                lineToRelative(8.0f, 2.895f)
                close()
            }
        }
        .build()
        return _bxsPlane!!
    }

private var _bxsPlane: ImageVector? = null
