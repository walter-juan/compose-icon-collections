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

public val SolidGroup.BxsPear: ImageVector
    get() {
        if (_bxsPear != null) {
            return _bxsPear!!
        }
        _bxsPear = Builder(name = "BxsPear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.12f, 22.0f)
                arcToRelative(7.71f, 7.71f, 0.0f, false, false, 6.57f, -5.0f)
                arcToRelative(7.23f, 7.23f, 0.0f, false, false, 0.46f, -3.21f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 1.0f, -2.57f)
                lineToRelative(0.61f, -0.61f)
                arcTo(3.89f, 3.89f, 0.0f, false, false, 19.43f, 6.0f)
                lineToRelative(2.28f, -2.28f)
                lineToRelative(-1.42f, -1.43f)
                lineTo(18.0f, 4.55f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, -4.66f, 0.57f)
                lineToRelative(-0.75f, 0.75f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, true, -2.52f, 1.0f)
                arcToRelative(7.05f, 7.05f, 0.0f, false, false, -3.32f, 0.57f)
                arcTo(7.75f, 7.75f, 0.0f, false, false, 2.0f, 14.11f)
                arcTo(7.59f, 7.59f, 0.0f, false, false, 10.12f, 22.0f)
                close()
                moveTo(9.5f, 9.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(3.75f, 3.75f, 0.0f, false, false, -3.75f, 3.75f)
                horizontalLineToRelative(-1.5f)
                arcTo(5.26f, 5.26f, 0.0f, false, true, 9.5f, 9.25f)
                close()
            }
        }
        .build()
        return _bxsPear!!
    }

private var _bxsPear: ImageVector? = null
