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

public val SolidGroup.BxsMessageRounded: ImageVector
    get() {
        if (_bxsMessageRounded != null) {
            return _bxsMessageRounded!!
        }
        _bxsMessageRounded = Builder(name = "BxsMessageRounded", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 2.908f, 1.898f, 5.515f, 5.0f, 6.934f)
                verticalLineTo(22.0f)
                lineToRelative(5.34f, -4.005f)
                curveTo(17.697f, 17.852f, 22.0f, 14.32f, 22.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -4.486f, -8.0f, -10.0f, -8.0f)
                close()
            }
        }
        .build()
        return _bxsMessageRounded!!
    }

private var _bxsMessageRounded: ImageVector? = null
