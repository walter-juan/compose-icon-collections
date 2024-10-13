package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxPhotoAlbum: ImageVector
    get() {
        if (_bxPhotoAlbum != null) {
            return _bxPhotoAlbum!!
        }
        _bxPhotoAlbum = Builder(name = "BxPhotoAlbum", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.024f, 11.536f)
                lineTo(10.0f, 10.0f)
                lineToRelative(-2.0f, 3.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-3.5f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.503f, 7.497f)
                moveToRelative(-1.503f, 0.0f)
                arcToRelative(1.503f, 1.503f, 0.0f, true, true, 3.006f, 0.0f)
                arcToRelative(1.503f, 1.503f, 0.0f, true, true, -3.006f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(6.0f, 2.0f)
                curveToRelative(-1.206f, 0.0f, -3.0f, 0.799f, -3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 2.201f, 1.794f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(15.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.012f, 20.0f)
                curveTo(5.55f, 19.988f, 5.0f, 19.806f, 5.0f, 19.0f)
                reflectiveCurveToRelative(0.55f, -0.988f, 1.012f, -1.0f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(19.0f, 16.0f)
                lineTo(5.0f, 16.0f)
                lineTo(5.0f, 5.0f)
                curveToRelative(0.0f, -0.806f, 0.55f, -0.988f, 1.0f, -1.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _bxPhotoAlbum!!
    }

private var _bxPhotoAlbum: ImageVector? = null
