package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxSave: ImageVector
    get() {
        if (_bxSave != null) {
            return _bxSave!!
        }
        _bxSave = Builder(name = "BxSave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(21.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.29f, -0.71f)
                lineToRelative(-4.0f, -4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                close()
                moveTo(15.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(13.0f, 7.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineToRelative(0.59f)
                lineTo(19.0f, 8.41f)
                lineTo(19.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(9.0f, 12.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(5.0f, 19.0f)
                close()
            }
        }
        .build()
        return _bxSave!!
    }

private var _bxSave: ImageVector? = null
