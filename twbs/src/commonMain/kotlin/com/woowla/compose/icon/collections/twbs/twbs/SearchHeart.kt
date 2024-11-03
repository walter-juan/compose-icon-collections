package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SearchHeart: ImageVector
    get() {
        if (_searchHeart != null) {
            return _searchHeart!!
        }
        _searchHeart = Builder(name = "SearchHeart", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 4.482f)
                curveToRelative(1.664f, -1.673f, 5.825f, 1.254f, 0.0f, 5.018f)
                curveToRelative(-5.825f, -3.764f, -1.664f, -6.69f, 0.0f, -5.018f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.5f)
                arcToRelative(6.47f, 6.47f, 0.0f, false, true, -1.258f, 3.844f)
                quadToRelative(0.06f, 0.044f, 0.115f, 0.098f)
                lineToRelative(3.85f, 3.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 1.415f)
                lineToRelative(-3.85f, -3.85f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.1f, -0.115f)
                horizontalLineToRelative(0.002f)
                arcTo(6.5f, 6.5f, 0.0f, true, true, 13.0f, 6.5f)
                moveTo(6.5f, 12.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, true, false, 0.0f, -11.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 11.0f)
            }
        }
        .build()
        return _searchHeart!!
    }

private var _searchHeart: ImageVector? = null
