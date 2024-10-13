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

public val SolidGroup.BxsCableCar: ImageVector
    get() {
        if (_bxsCableCar != null) {
            return _bxsCableCar!!
        }
        _bxsCableCar = Builder(name = "BxsCableCar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(2.0f, 9.76f)
                lineToRelative(9.0f, -2.45f)
                lineTo(11.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(13.0f, 6.76f)
                lineToRelative(9.0f, -2.45f)
                lineTo(22.0f, 2.24f)
                lineTo(2.0f, 7.69f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 15.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(17.0f, 12.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxsCableCar!!
    }

private var _bxsCableCar: ImageVector? = null
