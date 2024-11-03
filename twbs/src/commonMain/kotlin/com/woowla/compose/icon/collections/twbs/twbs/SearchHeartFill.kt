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

public val Twbs.SearchHeartFill: ImageVector
    get() {
        if (_searchHeartFill != null) {
            return _searchHeartFill!!
        }
        _searchHeartFill = Builder(name = "SearchHeartFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 13.0f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, false, 3.845f, -1.258f)
                horizontalLineToRelative(-0.001f)
                quadToRelative(0.044f, 0.06f, 0.098f, 0.115f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.415f, -1.414f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.115f, -0.1f)
                arcTo(6.47f, 6.47f, 0.0f, false, false, 13.0f, 6.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 6.5f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                moveToRelative(0.0f, -8.518f)
                curveToRelative(1.664f, -1.673f, 5.825f, 1.254f, 0.0f, 5.018f)
                curveToRelative(-5.825f, -3.764f, -1.664f, -6.69f, 0.0f, -5.018f)
            }
        }
        .build()
        return _searchHeartFill!!
    }

private var _searchHeartFill: ImageVector? = null
