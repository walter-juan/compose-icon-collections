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

public val RegularGroup.BxBarcode: ImageVector
    get() {
        if (_bxBarcode != null) {
            return _bxBarcode!!
        }
        _bxBarcode = Builder(name = "BxBarcode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 18.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.0f, 16.0f)
                close()
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                lineTo(9.0f, 16.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(11.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-1.0f)
                close()
            }
        }
        .build()
        return _bxBarcode!!
    }

private var _bxBarcode: ImageVector? = null
