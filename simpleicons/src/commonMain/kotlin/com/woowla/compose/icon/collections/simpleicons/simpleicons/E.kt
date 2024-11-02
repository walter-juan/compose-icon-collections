package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.E: ImageVector
    get() {
        if (_e != null) {
            return _e!!
        }
        _e = Builder(name = "E", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.004f, 12.004f)
                arcTo(12.012f, 12.012f, 0.0f, false, false, 12.0f, 24.0f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, 2.266f, -2.266f)
                arcTo(2.27f, 2.27f, 0.0f, false, false, 12.0f, 19.467f)
                curveToRelative(-4.116f, 0.0f, -7.463f, -3.347f, -7.463f, -7.463f)
                reflectiveCurveTo(7.884f, 4.541f, 12.0f, 4.541f)
                curveToRelative(3.323f, 0.0f, 6.15f, 2.186f, 7.111f, 5.197f)
                horizontalLineTo(12.0f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, -2.266f, 2.266f)
                arcTo(2.27f, 2.27f, 0.0f, false, false, 12.0f, 14.27f)
                horizontalLineToRelative(9.73f)
                arcToRelative(2.27f, 2.27f, 0.0f, false, false, 2.266f, -2.266f)
                arcTo(12.02f, 12.02f, 0.0f, false, false, 12.0f, 0.0f)
                curveTo(5.385f, 0.008f, 0.004f, 5.39f, 0.004f, 12.004f)
            }
        }
        .build()
        return _e!!
    }

private var _e: ImageVector? = null
