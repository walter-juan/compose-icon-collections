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

public val RegularGroup.BxReflectHorizontal: ImageVector
    get() {
        if (_bxReflectHorizontal != null) {
            return _bxReflectHorizontal!!
        }
        _bxReflectHorizontal = Builder(name = "BxReflectHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.0f)
                horizontalLineToRelative(12.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-6.0f, 6.0f)
                close()
                moveTo(18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(6.0f, -6.0f)
                close()
                moveTo(3.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(8.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(13.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(18.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxReflectHorizontal!!
    }

private var _bxReflectHorizontal: ImageVector? = null
