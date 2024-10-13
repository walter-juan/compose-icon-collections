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

public val RegularGroup.BxListCheck: ImageVector
    get() {
        if (_bxListCheck != null) {
            return _bxListCheck!!
        }
        _bxListCheck = Builder(name = "BxListCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 13.0f)
                close()
                moveTo(4.0f, 15.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 17.0f)
                close()
                moveTo(19.299f, 12.292f)
                lineTo(14.999f, 16.583f)
                lineTo(13.707f, 15.292f)
                lineTo(12.293f, 16.707f)
                lineTo(14.999f, 19.411f)
                lineTo(20.711f, 13.708f)
                close()
            }
        }
        .build()
        return _bxListCheck!!
    }

private var _bxListCheck: ImageVector? = null
