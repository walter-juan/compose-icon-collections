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

public val SolidGroup.BxsPhotoAlbum: ImageVector
    get() {
        if (_bxsPhotoAlbum != null) {
            return _bxsPhotoAlbum!!
        }
        _bxsPhotoAlbum = Builder(name = "BxsPhotoAlbum", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.012f)
                curveTo(5.55f, 19.988f, 5.0f, 19.806f, 5.0f, 19.0f)
                reflectiveCurveToRelative(0.55f, -0.988f, 1.012f, -1.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(9.503f, 5.0f)
                arcToRelative(1.503f, 1.503f, 0.0f, true, true, 0.0f, 3.006f)
                arcToRelative(1.503f, 1.503f, 0.0f, false, true, 0.0f, -3.006f)
                close()
                moveTo(12.0f, 13.0f)
                horizontalLineTo(7.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(1.5f, 1.399f)
                lineTo(14.5f, 8.0f)
                lineToRelative(3.5f, 5.0f)
                horizontalLineToRelative(-6.0f)
                close()
            }
        }
        .build()
        return _bxsPhotoAlbum!!
    }

private var _bxsPhotoAlbum: ImageVector? = null
