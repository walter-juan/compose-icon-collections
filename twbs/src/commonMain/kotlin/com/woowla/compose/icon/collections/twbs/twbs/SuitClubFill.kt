package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SuitClubFill: ImageVector
    get() {
        if (_suitClubFill != null) {
            return _suitClubFill!!
        }
        _suitClubFill = Builder(name = "SuitClubFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -2.684f, -1.254f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.582f, 2.907f)
                curveToRelative(0.231f, 0.35f, -0.02f, 0.847f, -0.438f, 0.847f)
                horizontalLineTo(6.04f)
                curveToRelative(-0.419f, 0.0f, -0.67f, -0.497f, -0.438f, -0.847f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 1.582f, -2.907f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, -2.538f, -5.743f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 6.708f, 0.0f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 11.5f, 12.5f)
            }
        }
        .build()
        return _suitClubFill!!
    }

private var _suitClubFill: ImageVector? = null
