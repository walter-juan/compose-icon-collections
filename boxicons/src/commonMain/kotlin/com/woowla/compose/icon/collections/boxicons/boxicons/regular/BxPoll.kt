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

public val RegularGroup.BxPoll: ImageVector
    get() {
        if (_bxPoll != null) {
            return _bxPoll!!
        }
        _bxPoll = Builder(name = "BxPoll", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 13.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineToRelative(10.97f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 17.0f)
                close()
                moveTo(4.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                lineTo(4.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxPoll!!
    }

private var _bxPoll: ImageVector? = null
