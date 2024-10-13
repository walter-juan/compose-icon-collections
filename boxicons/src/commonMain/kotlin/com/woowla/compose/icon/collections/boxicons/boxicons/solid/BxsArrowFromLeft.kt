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

public val SolidGroup.BxsArrowFromLeft: ImageVector
    get() {
        if (_bxsArrowFromLeft != null) {
            return _bxsArrowFromLeft!!
        }
        _bxsArrowFromLeft = Builder(name = "BxsArrowFromLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bxsArrowFromLeft!!
    }

private var _bxsArrowFromLeft: ImageVector? = null
