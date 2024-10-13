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

public val SolidGroup.BxsMessageRoundedEdit: ImageVector
    get() {
        if (_bxsMessageRoundedEdit != null) {
            return _bxsMessageRoundedEdit!!
        }
        _bxsMessageRoundedEdit = Builder(name = "BxsMessageRoundedEdit", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.486f, 2.0f, 2.0f, 5.589f, 2.0f, 10.0f)
                curveToRelative(0.0f, 2.907f, 1.897f, 5.516f, 5.0f, 6.934f)
                lineTo(7.0f, 22.0f)
                lineToRelative(5.34f, -4.005f)
                curveTo(17.697f, 17.854f, 22.0f, 14.32f, 22.0f, 10.0f)
                curveToRelative(0.0f, -4.411f, -4.486f, -8.0f, -10.0f, -8.0f)
                close()
                moveTo(9.302f, 13.986f)
                lineTo(7.503f, 13.986f)
                verticalLineToRelative(-1.798f)
                lineToRelative(4.976f, -4.97f)
                lineToRelative(1.798f, 1.799f)
                lineToRelative(-4.975f, 4.969f)
                close()
                moveTo(15.125f, 8.17f)
                lineTo(13.326f, 6.372f)
                lineTo(14.698f, 5.001f)
                lineTo(16.497f, 6.799f)
                lineTo(15.125f, 8.17f)
                close()
            }
        }
        .build()
        return _bxsMessageRoundedEdit!!
    }

private var _bxsMessageRoundedEdit: ImageVector? = null
