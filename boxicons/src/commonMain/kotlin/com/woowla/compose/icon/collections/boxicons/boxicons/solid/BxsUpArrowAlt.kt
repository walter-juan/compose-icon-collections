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

public val SolidGroup.BxsUpArrowAlt: ImageVector
    get() {
        if (_bxsUpArrowAlt != null) {
            return _bxsUpArrowAlt!!
        }
        _bxsUpArrowAlt = Builder(name = "BxsUpArrowAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 18.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-6.0f, -7.0f)
                lineToRelative(-6.0f, 7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.0f)
                close()
            }
        }
        .build()
        return _bxsUpArrowAlt!!
    }

private var _bxsUpArrowAlt: ImageVector? = null
