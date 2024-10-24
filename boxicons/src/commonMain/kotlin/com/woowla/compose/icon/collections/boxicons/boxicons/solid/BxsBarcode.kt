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

public val SolidGroup.BxsBarcode: ImageVector
    get() {
        if (_bxsBarcode != null) {
            return _bxsBarcode!!
        }
        _bxsBarcode = Builder(name = "BxsBarcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(22.0f, 6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(8.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(10.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(12.0f, 17.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                close()
                moveTo(16.0f, 17.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(13.0f, 7.0f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(17.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsBarcode!!
    }

private var _bxsBarcode: ImageVector? = null