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

public val SolidGroup.BxsMapAlt: ImageVector
    get() {
        if (_bxsMapAlt != null) {
            return _bxsMapAlt!!
        }
        _bxsMapAlt = Builder(name = "BxsMapAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.0f, 6.882f)
                lineToRelative(-7.0f, -3.5f)
                verticalLineToRelative(13.236f)
                lineToRelative(7.0f, 3.5f)
                lineToRelative(6.0f, -3.0f)
                lineToRelative(7.0f, 3.5f)
                verticalLineTo(7.382f)
                lineToRelative(-7.0f, -3.5f)
                lineToRelative(-6.0f, 3.0f)
                close()
                moveTo(15.0f, 15.0f)
                lineToRelative(-6.0f, 3.0f)
                verticalLineTo(9.0f)
                lineToRelative(6.0f, -3.0f)
                verticalLineToRelative(9.0f)
                close()
            }
        }
        .build()
        return _bxsMapAlt!!
    }

private var _bxsMapAlt: ImageVector? = null
