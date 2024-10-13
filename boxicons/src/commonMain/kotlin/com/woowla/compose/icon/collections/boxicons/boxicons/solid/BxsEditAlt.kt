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

public val SolidGroup.BxsEditAlt: ImageVector
    get() {
        if (_bxsEditAlt != null) {
            return _bxsEditAlt!!
        }
        _bxsEditAlt = Builder(name = "BxsEditAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.0f, 2.012f)
                lineToRelative(3.0f, 3.0f)
                lineTo(16.713f, 7.3f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(8.299f, -8.287f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(4.0f, 20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bxsEditAlt!!
    }

private var _bxsEditAlt: ImageVector? = null
