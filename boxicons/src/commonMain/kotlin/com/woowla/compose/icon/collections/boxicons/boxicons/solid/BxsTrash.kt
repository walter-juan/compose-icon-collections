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

public val SolidGroup.BxsTrash: ImageVector
    get() {
        if (_bxsTrash != null) {
            return _bxsTrash!!
        }
        _bxsTrash = Builder(name = "BxsTrash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                lineTo(19.0f, 7.0f)
                lineTo(6.0f, 7.0f)
                close()
                moveTo(10.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.0f, 19.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(16.618f, 4.0f)
                lineTo(15.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                lineTo(7.382f, 4.0f)
                lineTo(3.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bxsTrash!!
    }

private var _bxsTrash: ImageVector? = null
