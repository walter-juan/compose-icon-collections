package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxDoorOpen: ImageVector
    get() {
        if (_bxDoorOpen != null) {
            return _bxDoorOpen!!
        }
        _bxDoorOpen = Builder(name = "BxDoorOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.385f, 21.788f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.857f, 0.182f)
                lineToRelative(8.0f, -2.0f)
                arcTo(0.999f, 0.999f, 0.0f, false, false, 20.0f, 19.0f)
                verticalLineTo(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.758f, -0.97f)
                lineToRelative(-8.0f, -2.0f)
                arcTo(1.003f, 1.003f, 0.0f, false, false, 10.0f, 3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.308f, 0.142f, 0.599f, 0.385f, 0.788f)
                close()
                moveTo(12.0f, 4.281f)
                lineToRelative(6.0f, 1.5f)
                verticalLineToRelative(12.438f)
                lineToRelative(-6.0f, 1.5f)
                verticalLineTo(4.281f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.242f, 13.159f)
                curveToRelative(0.446f, -0.112f, 0.758f, -0.512f, 0.758f, -0.971f)
                verticalLineToRelative(-0.377f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.001f)
                verticalLineToRelative(0.377f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.242f, 0.97f)
                close()
            }
        }
        .build()
        return _bxDoorOpen!!
    }

private var _bxDoorOpen: ImageVector? = null
