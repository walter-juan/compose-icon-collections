package com.woowla.compose.icon.collections.boxicons.boxicons.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlPeriscope: ImageVector
    get() {
        if (_bxlPeriscope != null) {
            return _bxlPeriscope!!
        }
        _bxlPeriscope = Builder(name = "BxlPeriscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.102f, 21.0f)
                curveToRelative(1.406f, 0.0f, 6.985f, -6.329f, 6.985f, -10.571f)
                curveTo(19.087f, 6.368f, 15.915f, 3.0f, 12.102f, 3.0f)
                curveToRelative(-4.017f, 0.0f, -7.188f, 3.366f, -7.188f, 7.429f)
                curveTo(4.913f, 14.67f, 10.492f, 21.0f, 12.102f, 21.0f)
                close()
                moveTo(10.979f, 5.885f)
                arcToRelative(4.696f, 4.696f, 0.0f, false, true, 1.143f, -0.139f)
                curveToRelative(2.25f, 0.0f, 4.186f, 1.913f, 4.186f, 4.398f)
                curveToRelative(0.0f, 2.238f, -1.936f, 4.151f, -4.196f, 4.151f)
                curveToRelative(-2.509f, 0.0f, -4.444f, -1.913f, -4.444f, -4.151f)
                curveToRelative(0.0f, -1.047f, 0.338f, -1.98f, 0.922f, -2.723f)
                verticalLineToRelative(0.022f)
                curveToRelative(0.0f, 0.934f, 0.755f, 1.676f, 1.688f, 1.676f)
                curveToRelative(0.933f, 0.002f, 1.722f, -0.764f, 1.722f, -1.697f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, -1.02f, -1.54f)
                lineToRelative(-0.001f, 0.003f)
                close()
            }
        }
        .build()
        return _bxlPeriscope!!
    }

private var _bxlPeriscope: ImageVector? = null
