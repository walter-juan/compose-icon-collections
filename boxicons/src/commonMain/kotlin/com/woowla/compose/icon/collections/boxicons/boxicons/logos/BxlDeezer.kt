package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlDeezer: ImageVector
    get() {
        if (_bxlDeezer != null) {
            return _bxlDeezer!!
        }
        _bxlDeezer = Builder(name = "BxlDeezer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.68f, 5.47f)
                lineTo(22.0f, 5.47f)
                lineTo(22.0f, 8.0f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(17.68f, 8.98f)
                lineTo(22.0f, 8.98f)
                verticalLineToRelative(2.53f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(17.68f, 12.49f)
                lineTo(22.0f, 12.49f)
                verticalLineToRelative(2.53f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(2.0f, 16.0f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                lineTo(2.0f, 18.53f)
                close()
                moveTo(7.22f, 16.0f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                lineTo(7.22f, 18.53f)
                close()
                moveTo(12.45f, 16.0f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(17.68f, 16.0f)
                lineTo(22.0f, 16.0f)
                verticalLineToRelative(2.53f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(12.45f, 12.49f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                horizontalLineToRelative(-4.32f)
                close()
                moveTo(7.22f, 12.49f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                lineTo(7.22f, 15.02f)
                close()
                moveTo(7.22f, 8.98f)
                horizontalLineToRelative(4.32f)
                verticalLineToRelative(2.53f)
                lineTo(7.22f, 11.51f)
                close()
            }
        }
        .build()
        return _bxlDeezer!!
    }

private var _bxlDeezer: ImageVector? = null
