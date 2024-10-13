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

public val RegularGroup.BxPulse: ImageVector
    get() {
        if (_bxPulse != null) {
            return _bxPulse!!
        }
        _bxPulse = Builder(name = "BxPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.97f, 4.757f)
                arcToRelative(0.999f, 0.999f, 0.0f, false, false, -1.918f, -0.073f)
                lineToRelative(-3.186f, 9.554f)
                lineToRelative(-2.952f, -6.644f)
                arcToRelative(1.002f, 1.002f, 0.0f, false, false, -1.843f, 0.034f)
                lineTo(5.323f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.323f)
                curveToRelative(0.823f, 0.0f, 1.552f, -0.494f, 1.856f, -1.257f)
                lineToRelative(0.869f, -2.172f)
                lineToRelative(3.037f, 6.835f)
                curveToRelative(0.162f, 0.363f, 0.521f, 0.594f, 0.915f, 0.594f)
                lineToRelative(0.048f, -0.001f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, false, 0.9f, -0.683f)
                lineToRelative(2.914f, -8.742f)
                lineToRelative(0.979f, 3.911f)
                arcTo(1.995f, 1.995f, 0.0f, false, false, 18.781f, 14.0f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-3.22f)
                lineToRelative(-1.81f, -7.243f)
                close()
            }
        }
        .build()
        return _bxPulse!!
    }

private var _bxPulse: ImageVector? = null
