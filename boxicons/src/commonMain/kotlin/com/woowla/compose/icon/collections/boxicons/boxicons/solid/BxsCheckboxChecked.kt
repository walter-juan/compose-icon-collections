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

public val SolidGroup.BxsCheckboxChecked: ImageVector
    get() {
        if (_bxsCheckboxChecked != null) {
            return _bxsCheckboxChecked!!
        }
        _bxsCheckboxChecked = Builder(name = "BxsCheckboxChecked", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(19.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(7.0f, 5.0f)
                close()
                moveTo(11.0f, 15.414f)
                lineTo(8.293f, 12.707f)
                lineTo(9.707f, 11.293f)
                lineTo(11.0f, 12.586f)
                lineToRelative(3.793f, -3.793f)
                lineToRelative(1.414f, 1.414f)
                lineTo(11.0f, 15.414f)
                close()
            }
        }
        .build()
        return _bxsCheckboxChecked!!
    }

private var _bxsCheckboxChecked: ImageVector? = null
