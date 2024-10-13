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

public val SolidGroup.BxsPlaneTakeOff: ImageVector
    get() {
        if (_bxsPlaneTakeOff != null) {
            return _bxsPlaneTakeOff!!
        }
        _bxsPlaneTakeOff = Builder(name = "BxsPlaneTakeOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 20.0f)
                close()
                moveTo(21.509f, 8.527f)
                arcToRelative(1.61f, 1.61f, 0.0f, false, false, -2.036f, -1.019f)
                lineTo(15.0f, 9.0f)
                lineTo(7.0f, 6.0f)
                lineTo(5.0f, 7.0f)
                lineToRelative(6.0f, 4.0f)
                lineToRelative(-4.0f, 2.0f)
                lineToRelative(-4.0f, -2.0f)
                lineToRelative(-1.0f, 1.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(14.547f, -5.455f)
                arcToRelative(1.611f, 1.611f, 0.0f, false, false, 0.962f, -2.018f)
                close()
            }
        }
        .build()
        return _bxsPlaneTakeOff!!
    }

private var _bxsPlaneTakeOff: ImageVector? = null
