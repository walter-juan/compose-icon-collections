package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup

public val OutlineGroup.CrossOff: ImageVector
    get() {
        if (_crossOff != null) {
            return _crossOff!!
        }
        _crossOff = Builder(name = "CrossOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(3.0f)
                moveToRelative(-2.0f, 2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-7.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _crossOff!!
    }

private var _crossOff: ImageVector? = null
