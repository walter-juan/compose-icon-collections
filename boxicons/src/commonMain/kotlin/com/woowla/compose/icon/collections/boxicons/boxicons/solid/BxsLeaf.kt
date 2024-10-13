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

public val SolidGroup.BxsLeaf: ImageVector
    get() {
        if (_bxsLeaf != null) {
            return _bxsLeaf!!
        }
        _bxsLeaf = Builder(name = "BxsLeaf", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 3.41f)
                lineToRelative(-0.12f, -1.26f)
                lineToRelative(-1.2f, 0.4f)
                arcToRelative(13.84f, 13.84f, 0.0f, false, true, -6.41f, 0.64f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, -6.68f, 0.9f)
                arcTo(7.23f, 7.23f, 0.0f, false, false, 3.3f, 9.5f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 0.39f, 4.58f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, 1.18f, -2.2f)
                arcToRelative(9.85f, 9.85f, 0.0f, false, true, 4.07f, -3.43f)
                arcToRelative(11.16f, 11.16f, 0.0f, false, true, 5.06f, -1.0f)
                arcTo(12.08f, 12.08f, 0.0f, false, false, 9.34f, 9.2f)
                arcToRelative(9.48f, 9.48f, 0.0f, false, false, -1.86f, 1.53f)
                arcToRelative(11.38f, 11.38f, 0.0f, false, false, -1.39f, 1.91f)
                arcToRelative(16.39f, 16.39f, 0.0f, false, false, -1.57f, 4.54f)
                arcTo(26.42f, 26.42f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(30.69f, 30.69f, 0.0f, false, true, 0.59f, -4.32f)
                arcToRelative(9.25f, 9.25f, 0.0f, false, false, 4.52f, 1.11f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 4.28f, -0.87f)
                curveTo(23.0f, 14.67f, 22.0f, 3.86f, 22.0f, 3.41f)
                close()
            }
        }
        .build()
        return _bxsLeaf!!
    }

private var _bxsLeaf: ImageVector? = null
