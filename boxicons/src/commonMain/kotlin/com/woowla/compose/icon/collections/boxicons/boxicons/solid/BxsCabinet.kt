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

public val SolidGroup.BxsCabinet: ImageVector
    get() {
        if (_bxsCabinet != null) {
            return _bxsCabinet!!
        }
        _bxsCabinet = Builder(name = "BxsCabinet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-7.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(8.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                lineTo(8.0f, 19.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxsCabinet!!
    }

private var _bxsCabinet: ImageVector? = null
